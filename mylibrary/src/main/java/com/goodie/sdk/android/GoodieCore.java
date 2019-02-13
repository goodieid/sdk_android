package com.goodie.sdk.android;
import android.app.Application;
import android.content.Context;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.builder.LoginBuilder;
import com.goodie.sdk.android.data.builder.MemberPointBuilder;
import com.goodie.sdk.android.data.builder.RegisterBuilder;
import com.goodie.sdk.android.data.listener.SetRegisterListener;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;
import com.goodie.sdk.android.data.response.LoginResponse;
import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;
import com.goodie.sdk.android.data.listener.SetMemberPointListener;
import com.goodie.sdk.android.data.listener.SetLoginListener;
import com.goodie.sdk.android.data.response.RegisterResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by asep.surahman on 09/01/2019.
 */

public class GoodieCore{

    private static Application appInstance;
    private static String appId;
    private static String appServer;

    GoodieCore(){}

    /**
     * The first method you need to be invoke to using goodie sdk. Call this method from your Application
     * class. You can not using another goodie feature if you not invoke this method first. Here sample
     * to call this method:
     * <pre>
     * {@code
     * public class SampleApps extends Application {
     *  public void onCreate() {
     *      super.onCreate();
     *      GoodieCore.init(this, "yourQiscusAppId");
     *  }
     * }
     * }
     * </pre>
     *
     * @param application Application instance
     * @param goodieAppId Your goodie application Id
     */
    public static void init(Application application, String qiscusAppId){
        initWithCustomServer(application, qiscusAppId, "");
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    public static void initWithCustomServer(Application application, String goodieAppId, String serverBaseUrl){
        appInstance = application;
        appId = goodieAppId;
        appServer = !serverBaseUrl.endsWith("/") ? serverBaseUrl + "/" : serverBaseUrl;
    }


    //login
    public static LoginBuilder setLoginUser(String userEmail, String userKey, String memberId){
        return new LoginBuilder(userEmail, userKey, memberId);
    }

    public void loginGoodie(Context context, SetLoginListener listener){
        loginObserv( LoginBuilder.username,  LoginBuilder.password,  LoginBuilder.memberId, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<LoginResponse> loginObserv(String username, String password, String memberId, Context context){
        return GoodieApis.getInstance().doLogin(username, password, memberId, context);
    }
    //end



    //register user
    public static RegisterBuilder setRegisterUser(String username, String merchantId, String phoneNumber,
                                                  String password, String firstName, String lastName,
                                                  String birthDate, String referralCode){
        return new RegisterBuilder(username, merchantId, phoneNumber, password, firstName, lastName,
                                                 birthDate, referralCode);
    }

    public void regiterGoodie(Context context, SetRegisterListener listener){
        registerObserv(RegisterBuilder.username, RegisterBuilder.merchantId, RegisterBuilder.phoneNumber, RegisterBuilder.password,
                RegisterBuilder.firstName, RegisterBuilder.lastName, RegisterBuilder.birthDate, RegisterBuilder.referralCode, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<RegisterResponse> registerObserv(String username, String merchantId, String phoneNumber,
                                                       String password, String firstName, String lastName,
                                                       String birthDate, String referralCode, Context context){
        return GoodieApis.getInstance().doRegister(username, merchantId, phoneNumber, password, firstName, lastName,
                                                        birthDate, referralCode, context);
    }
    //end


    //member point
    public static MemberPointBuilder setMemberPointBuilder(String contentType, String authToken, CheckMemberPointsReq request){
        return new MemberPointBuilder(contentType, authToken, request);
    }

    public void memberPointGoodie(Context context, SetMemberPointListener listener){
        memberPointObserv(MemberPointBuilder.contentType, MemberPointBuilder.authToken, context, MemberPointBuilder.checkMemberPointsReq)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<MemberPointBalanceResponse> memberPointObserv(String contentType, String authToken, Context context, CheckMemberPointsReq req){
        return GoodieApis.getInstance().doMemberPoint(contentType, authToken, context, req);
    }
    //end



    /**
     * Use this method if we need application context instance
     *
     * @return Your application instance
     */
    public static Application getApps(){
        checkAppIdSetup();
        return appInstance;
    }


    /**
     * AppId checker
     *
     * @throws RuntimeException
     */
    public static void checkAppIdSetup() throws RuntimeException {
        if (appServer == null) {
            throw new RuntimeException("Please init Goodie with your app id before!");
        }
    }



}
