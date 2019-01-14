package com.goodie.sdk.android.data.api;
import com.goodie.sdk.android.data.bean.GoodieAccount;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.response.LoginResponse;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by asep.surahman on 14/01/2019.
 */

public enum GoodieApis {

    INSTANCE;
    private final Apis api;
    private String baseUrl;

    GoodieApis(){

        baseUrl = "http://52.76.117.11:8081/lifestyle-ws-vc2/api-rest/"; //URL STAGING
        api = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(getCustomClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(Apis.class);
    }

    public static GoodieApis getInstance() {
        return INSTANCE;
    }

    private OkHttpClient getCustomClient(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(
                new Interceptor(){
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder requestBuilder = chain.request().newBuilder();
                        requestBuilder.header("Content-Type", "application/json");
                        return chain.proceed(requestBuilder.build());
                    }
                }
        ).addInterceptor(logging)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

        return httpClient;
    }


    public Observable<LoginResponse> loginOrRegister(String username, String password) {
        return api.loginRegister(getRequest(username, password));
    }

    private LoginRequest getRequest(String username, String password){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        return  loginRequest;
    }


    public interface Apis {
        @POST("authentication/create")
        Observable<LoginResponse> loginRegister(@Body LoginRequest request);
    }



}
