package com.goodie.library.data.api;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.goodie.library.ui.receiver.Tls12SocketFactory;
import com.goodie.library.utils.Constant;
import com.squareup.okhttp.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by asep.surahman on 16/01/2019.
 */

public class LibraryService {

    private Api api;

    /*Danareksa dev*/
    //public final static String BASE_URL = "http://13.251.61.30:8080/avantrade-portal-core/";

    /*Danareksa Production*/
    public final static String BASE_URL = "http://202.158.10.122:8081/avantrade-portal-core/";


    public final static String PORTAL_URL = "attachFile/download?id=";
    public final static String IMAGE_DOWNLOAD_URL = BASE_URL + "attachFile/download?id=";
    public final static String ASSETS_DOWNLOAD_URL = BASE_URL +  "attachFile/download?";
    public final static String IMAGE_CUSTOMER_DOWNLOAD_URL = BASE_URL + "customerDocument/download?id=";
    private final static String MOBILE_URL = "mobile-invisee/service/";
    public final static String UPLOAD = BASE_URL + "customerDocument/uploadByCustomer";
    public final static String Download = BASE_URL + "customerDocument/download";

    public LibraryService(Context context) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(provideOkHttpClient(context))
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.api = retrofit.create(Api.class);
    }

    public static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder httpClient) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sc = SSLContext.getInstance("TLSv1.2");
                sc.init(null, null, null);
                httpClient.sslSocketFactory(new Tls12SocketFactory(sc.getSocketFactory()));

                ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                        .tlsVersions(TlsVersion.TLS_1_2)
                        .build();

                List<ConnectionSpec> specs = new ArrayList<>();
                specs.add(cs);
                specs.add(ConnectionSpec.COMPATIBLE_TLS);
                specs.add(ConnectionSpec.CLEARTEXT);
                httpClient.connectionSpecs(specs);
            } catch (Exception exc) {
                Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc);
            }
        }

        return httpClient;
    }

    private OkHttpClient provideOkHttpClient(final Context context) {
        HttpLoggingInterceptor httpLoggingInterceptorinterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptorinterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(500, TimeUnit.SECONDS);
        httpClient.connectTimeout(500, TimeUnit.SECONDS);
        httpClient.addInterceptor(httpLoggingInterceptorinterceptor); //disable ketika production
        //httpClient.addInterceptor(new ChuckInterceptor(context)); //disable ketika production
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Response response = chain.proceed(request);
                invalidTokenHandler(response, context);
                return response;
            }
        });
        return enableTls12OnPreLollipop(httpClient).build();
    }

    private void invalidTokenHandler(Response response, Context context) throws IOException {
        String responseBody = response.peekBody(100000L).string();
        try {
            Object json = new JSONTokener(responseBody).nextValue();
            if (json instanceof JSONObject) {
                JSONObject jsonObject = new JSONObject(responseBody);
                if (jsonObject.has("code") && jsonObject.getInt("code") == Constant.INVALID_TOKEN) {
                    Intent intent = new Intent("Invalid");
                    context.sendBroadcast(intent);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Api getApi() {
        return api;
    }

    public interface Api{
        /*@POST("customersApi/loginEmailPassword")
        Observable<LoginResponse> login(@Query("email") String email,@Query("password") String password);*/
    }


}
