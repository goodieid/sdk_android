package com.goodie.sdk.android;
import android.app.Application;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.builder.LoginBuilder;
import com.goodie.sdk.android.data.builder.MemberPointBuilder;
import com.goodie.sdk.android.data.builder.PromotionInquiryBasicBuilder;
import com.goodie.sdk.android.data.builder.RegisterBuilder;
import com.goodie.sdk.android.data.builder.VerificationBuilder;
import com.goodie.sdk.android.data.config.GoodieConfig;

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

    public static VerificationBuilder setVerification(String username, String merchantId, String code){
        return GoodieCore.setVerificationUser(username, merchantId, code);
    }

    public static MemberPointBuilder setMemberPoint(String memberId, String merchantId){
        return GoodieCore.setMemberPointBuilder(memberId, merchantId);
    }

    public static PromotionInquiryBasicBuilder setPromotionInquiryBasic(String memberId, String merchantId,
                                                                        String storeId, String productCode, String refNumber,
                                                                        Double totalTrxAmount){
        return GoodieCore.setPromotionInqBuilder(memberId, merchantId, storeId, productCode, refNumber, totalTrxAmount);
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
