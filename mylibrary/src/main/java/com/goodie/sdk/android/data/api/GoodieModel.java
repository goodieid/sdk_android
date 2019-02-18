package com.goodie.sdk.android.data.api;
import android.content.Context;
import android.provider.Settings;
import com.goodie.sdk.android.data.bean.BasicRulesReq;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.request.MemberPointRequest;
import com.goodie.sdk.android.data.request.PromoInqBasicRequest;
import com.goodie.sdk.android.data.request.RegisterRequest;
import com.goodie.sdk.android.data.request.VerificationRequest;

/**
 * Created by Goodie on 13/02/2019.
 */

public class GoodieModel {

    //get deviceid
    public static String getDeviceId(Context context){
        String result = "";
        result = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return result;
    }

    //get data login request
    public static LoginRequest setLoginRequest(String username, String password, String memberId, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        loginRequest.setMerchantId(memberId);
        loginRequest.setDeviceUniqueId(idDevice);
        return  loginRequest;
    }

    //get data register request
    public static RegisterRequest setRegisterRequest(String username, String merchantId,
                                                     String phoneNumber, String password,
                                                     String firstName, String lastName,
                                                     String birthDate, String referralCode, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setUsername(username);
        registerRequest.setMerchantId(merchantId);
        registerRequest.setPhoneNumber(phoneNumber);
        registerRequest.setPassword(password);
        registerRequest.setFirstName(firstName);
        registerRequest.setLastName(lastName);
        registerRequest.setBirthDate(birthDate);
        registerRequest.setReferralCode(referralCode);
        registerRequest.setDeviceUniqueId(idDevice);
        return registerRequest;
    }

    //get data verification request
    public static VerificationRequest setVerificationRequest(String username, String code, String merchantId, Context context){
        VerificationRequest verificationRequest = new VerificationRequest();
        verificationRequest.setUsername(username);
        verificationRequest.setCode(code);
        verificationRequest.setMerchantId(merchantId);
        return  verificationRequest;
    }

    //get data member request
    public static MemberPointRequest setMemberPointRequest(String memberId, String merchantId, Context context){
        MemberPointRequest memberPointRequest = new MemberPointRequest();
        memberPointRequest.setMemberId(memberId);
        memberPointRequest.setMerchantId(merchantId);
        return  memberPointRequest;
    }

    //get data basiq role
    public static BasicRulesReq getBasicRoles(String productCode, String refNumber, Double totalTrxAmount){
        BasicRulesReq basicRulesReq = new BasicRulesReq();
        basicRulesReq.setProductCode(productCode);
        basicRulesReq.setRefNumber(refNumber);
        basicRulesReq.setTotalTrxAmount(totalTrxAmount);
        return  basicRulesReq;
    }


    public static PromoInqBasicRequest setPromoInqBasicRequest(String memberId, String merchantId, String storeId,
                                                               String productCode, String refNumber, Double totalTrxAmount, Context context){
        PromoInqBasicRequest promoInqBasicRequest = new PromoInqBasicRequest();
        promoInqBasicRequest.setMemberId(memberId);
        promoInqBasicRequest.setMerchantId(merchantId);
        promoInqBasicRequest.setStoreId(storeId);
        promoInqBasicRequest.setBasicRulesReq(getBasicRoles(productCode, refNumber, totalTrxAmount));
        return  promoInqBasicRequest;
    }





}
