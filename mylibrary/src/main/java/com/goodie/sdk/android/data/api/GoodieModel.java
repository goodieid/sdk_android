package com.goodie.sdk.android.data.api;
import android.content.Context;
import android.provider.Settings;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.request.MemberPointRequest;
import com.goodie.sdk.android.data.request.RegisterRequest;
import com.goodie.sdk.android.data.request.VerificationRequest;

/**
 * Created by Goodie on 13/02/2019.
 */

public class GoodieModel {

    public static String getDeviceId(Context context){
        String result = "";
        result = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return result;
    }

    public static LoginRequest setLoginRequest(String username, String password, String memberId, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        loginRequest.setMerchantId(memberId);
        loginRequest.setDeviceUniqueId(idDevice);
        return  loginRequest;
    }

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

    public static VerificationRequest setVerificationRequest(String username, String code, String merchantId, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        VerificationRequest verificationRequest = new VerificationRequest();
        verificationRequest.setUsername(username);
        verificationRequest.setCode(code);
        verificationRequest.setMerchantId(merchantId);
        return  verificationRequest;
    }

    public static MemberPointRequest setMemberPointRequest(String memberId, String merchantId, Context context){
        final String idDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        MemberPointRequest memberPointRequest = new MemberPointRequest();
        memberPointRequest.setMemberId(memberId);
        memberPointRequest.setMerchantId(merchantId);
        return  memberPointRequest;
    }

}
