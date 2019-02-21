package com.goodie.sdk.android;
import android.app.Application;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.bean.BasicRulesReq;
import com.goodie.sdk.android.data.bean.CustomRulesReq;
import com.goodie.sdk.android.data.builder.LoginBuilder;
import com.goodie.sdk.android.data.builder.MemberPointBuilder;
import com.goodie.sdk.android.data.builder.PromotionInquiryBasicBuilder;
import com.goodie.sdk.android.data.builder.PromotionInquiryBuilder;
import com.goodie.sdk.android.data.builder.PromotionInquiryCustomByAmountBuilder;
import com.goodie.sdk.android.data.builder.PromotionInquiryCustomIssuingBuilder;
import com.goodie.sdk.android.data.builder.PromotionPostingBuilder;
import com.goodie.sdk.android.data.builder.RegisterBuilder;
import com.goodie.sdk.android.data.builder.VerificationBuilder;
import com.goodie.sdk.android.data.config.GoodieConfig;
import java.util.List;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class Goodie{

    private static GoodieConfig goodieConfig;
    private Goodie(){
    }

    public static void init(Application application, String qiscusAppId){
        initWithCustomServer(application, qiscusAppId, "");
    }

    //login goodie
    public static LoginBuilder setLogin(String userEmail, String password, String memberId){
        return GoodieCore.setLoginUser(userEmail, password, memberId);
    }

    //register goodie
    public static RegisterBuilder setRegister(String username, String merchantId, String phoneNumber,
                                              String password, String firstName, String lastName,
                                              String birthDate, String referralCode){
        return GoodieCore.setRegisterUser(username, merchantId, phoneNumber, password, firstName, lastName, birthDate, referralCode);
    }

    //verification goodie
    public static VerificationBuilder setVerification(String username, String merchantId, String code){
        return GoodieCore.setVerificationUser(username, merchantId, code);
    }

    //memberpoint goodie
    public static MemberPointBuilder setMemberPoint(String memberId, String merchantId){
        return GoodieCore.setMemberPointBuilder(memberId, merchantId);
    }

    //promotion inquiry goodie all type (MIX)
    public static PromotionInquiryBuilder setPromotionMixInquiry(String memberId, String merchantId, String storeId,
                                                              BasicRulesReq basicRulesReq,
                                                              List<CustomRulesReq> customRulesReqs){
        return GoodieCore.setPromotionInquiryBuilder(memberId, merchantId, storeId, basicRulesReq, customRulesReqs);
    }

    //promotion posting goodie all type
    public static PromotionPostingBuilder setPromotionPosting(String memberId, String merchantId, String storeId,
                                                              BasicRulesReq basicRulesReq,
                                                              List<CustomRulesReq> customRulesReqs){
        return GoodieCore.setPromotionPostingBuilder(memberId, merchantId, storeId, basicRulesReq, customRulesReqs);
    }

    //promotion inquiry basic goodie
    public static PromotionInquiryBasicBuilder setPromotionInquiryBasic(String memberId, String merchantId, String storeId,
                                                                        String productCode, String refNumber, Double totalTrxAmount){
        return GoodieCore.setPromotionInqBasicBuilder(memberId, merchantId, storeId, productCode, refNumber, totalTrxAmount);
    }

    //promotion inquiry custom Issuing
    public static PromotionInquiryCustomIssuingBuilder setPromotionInquiryIssuing(String memberId, String merchantId, String storeId,
                                                                                String ruleName){
        return GoodieCore.setPromotionInqCustomIssuingBuilder(memberId, merchantId, storeId, ruleName, 1, 0.0, "");
    }


    //promotion inquiry custom by Amount
    public static PromotionInquiryCustomByAmountBuilder setPromotionInquiryByAmount(String memberId, String merchantId, String storeId,
                                                                                   String ruleName, Double amount){
        return GoodieCore.setPromotionInqCustomByAmountBuilder(memberId, merchantId, storeId, ruleName, 0, amount, "");
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    public static void initWithCustomServer(Application application, String qiscusAppId, String serverBaseUrl){
        GoodieCore.initWithCustomServer(application, qiscusAppId, serverBaseUrl);
        goodieConfig = new GoodieConfig();
    }

    public static GoodieConfig getConfig(){
        return goodieConfig;
    }

}
