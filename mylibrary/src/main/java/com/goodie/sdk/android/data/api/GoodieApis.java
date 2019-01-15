package com.goodie.sdk.android.data.api;
import android.content.Context;
import android.provider.Settings;

import com.goodie.sdk.android.data.request.CheckMemberPointsReq;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.response.LoginResponse;
import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
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
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor(){
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


    public Observable<LoginResponse> loginOrRegister(String username, String password, Context context){
        return api.loginRegister(getRequest(username, password, context));
    }

    public Observable<MemberPointBalanceResponse> memberPoint(String contentType,
                                                              String authToken,
                                                              Context context,
                                                              CheckMemberPointsReq request) {
        return api.checkMemberPoint(contentType, authToken, getDeviceId(context), request);
    }

    private LoginRequest getRequest(String username, String password, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        loginRequest.setDeviceUniqueId(idDevice);
        return  loginRequest;
    }

    private String getDeviceId(Context context){
        String result = "";
        result = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return result;
    }


    public interface Apis {

        //LOGIN
        @POST("authentication/create")
        Observable<LoginResponse> loginRegister(@Body LoginRequest request);

        //CHECK MEMBER POINT BALANCE
        @POST("member/points")
        Observable<MemberPointBalanceResponse> checkMemberPoint(@Header("Content-Type") String contentType,
                                                          @Header("authToken") String authToken,
                                                          @Header("deviceUniqueId") String deviceUniqueId,
                                                          @Body CheckMemberPointsReq request);
    }


}
