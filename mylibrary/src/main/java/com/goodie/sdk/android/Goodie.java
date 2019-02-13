package com.goodie.sdk.android;
import android.app.Application;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.builder.LoginBuilder;
import com.goodie.sdk.android.data.builder.MemberPointBuilder;
import com.goodie.sdk.android.data.builder.RegisterBuilder;
import com.goodie.sdk.android.data.config.GoodieConfig;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class Goodie {

    private static GoodieConfig goodieConfig;
    private Goodie(){
    }

    public static void init(Application application, String qiscusAppId){
        initWithCustomServer(application, qiscusAppId, "");
    }

    public static LoginBuilder setLogin(String userEmail, String password, String memberId){
        return GoodieCore.setLoginUser(userEmail, password, memberId);
    }

    public static RegisterBuilder setRegister(String username, String merchantId, String phoneNumber,
                                              String password, String firstName, String lastName,
                                              String birthDate, String referralCode){
        return GoodieCore.setRegisterUser(username, merchantId, phoneNumber, password, firstName, lastName,
                                            birthDate, referralCode);
    }

    public static MemberPointBuilder setMemberPoint(String contentType, String authToken, CheckMemberPointsReq request){
        return GoodieCore.setMemberPointBuilder(contentType, authToken, request);
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    public static void initWithCustomServer(Application application, String qiscusAppId, String serverBaseUrl) {
        GoodieCore.initWithCustomServer(application, qiscusAppId, serverBaseUrl);
        goodieConfig = new GoodieConfig();
    }

    public static GoodieConfig getConfig(){
        return goodieConfig;
    }

}
