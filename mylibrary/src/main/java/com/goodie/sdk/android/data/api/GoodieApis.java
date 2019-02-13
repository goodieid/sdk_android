package com.goodie.sdk.android.data.api;
import android.content.Context;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.request.RegisterRequest;
import com.goodie.sdk.android.data.response.LoginResponse;
import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;
import com.goodie.sdk.android.data.response.RegisterResponse;
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
        baseUrl = "http://52.76.117.11:8081/lifestyle-ws-goodie/api-rest/"; //URL GOODIE
        api = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(getCustomClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(Apis.class);
    }

    public static GoodieApis getInstance(){
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


    public Observable<LoginResponse> doLogin(String username, String password, String memberId, Context context){
        return api.login(GoodieModel.setLoginRequest(username, password, memberId, context));
    }

    public Observable<RegisterResponse> doRegister(String username, String merchantId, String phoneNumber,
                                                   String password, String firstName, String lastName,
                                                   String birthDate, String referralCode, Context context){
        return api.register(GoodieModel.setRegisterRequest(username, merchantId, phoneNumber, password,
                                                    firstName, lastName, birthDate, referralCode, context));
    }


    public Observable<MemberPointBalanceResponse> doMemberPoint(String contentType, String authToken, Context context, CheckMemberPointsReq request) {
        return api.checkMemberPoint(contentType, authToken, GoodieModel.getDeviceId(context), request);
    }

    public interface Apis {

        @POST("authentication/create")
        Observable<LoginResponse> login(@Body LoginRequest request);

        @POST("member/profile/registration")
        Observable<RegisterResponse> register(@Body RegisterRequest request);

        @POST("member/points")
        Observable<MemberPointBalanceResponse> checkMemberPoint(@Header("Content-Type") String contentType,
                                                          @Header("authToken") String authToken,
                                                          @Header("deviceUniqueId") String deviceUniqueId,
                                                          @Body CheckMemberPointsReq request);
    }


}
