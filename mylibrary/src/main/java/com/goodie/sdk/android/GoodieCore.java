package com.goodie.sdk.android;
import android.app.Application;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.builder.LoginBuilder;
import com.goodie.sdk.android.data.builder.MemberPointBuilder;
import com.goodie.sdk.android.data.builder.RegisterBuilder;
import com.goodie.sdk.android.data.builder.VerificationBuilder;

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

    //register user
    public static RegisterBuilder setRegisterUser(String username, String merchantId, String phoneNumber, String password, String firstName, String lastName,
                                                  String birthDate, String referralCode){
        return new RegisterBuilder(username, merchantId, phoneNumber, password, firstName, lastName, birthDate, referralCode);
    }

    //verification
    public static VerificationBuilder setVerificationUser(String username, String merchantId, String code){
        return new VerificationBuilder(username, merchantId, code);
    }

    //member point
    public static MemberPointBuilder setMemberPointBuilder(String memberId, String merchantId){
        return new MemberPointBuilder(memberId, merchantId);
    }




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
