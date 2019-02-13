package com.goodie.sdk.android.data.builder;

/**
 * Created by Goodie on 13/02/2019.
 */

public class RegisterBuilder {

    public static String username;
    public static String merchantId;
    public static String phoneNumber;
    public static String password;
    public static String firstName;
    public static String lastName;
    public static String birthDate;
    public static String referralCode;

    public RegisterBuilder(String username, String merchantId, String phoneNumber, String password,
                           String firstName, String lastName, String birthDate, String referralCode){
        RegisterBuilder.username = username;
        RegisterBuilder.merchantId = merchantId;
        RegisterBuilder.phoneNumber = phoneNumber;
        RegisterBuilder.password = password;
        RegisterBuilder.firstName = firstName;
        RegisterBuilder.lastName = lastName;
        RegisterBuilder.birthDate = birthDate;
        RegisterBuilder.referralCode = referralCode;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        RegisterBuilder.username = username;
    }

    public static String getMerchantId() {
        return merchantId;
    }

    public static void setMerchantId(String merchantId) {
        RegisterBuilder.merchantId = merchantId;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        RegisterBuilder.phoneNumber = phoneNumber;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        RegisterBuilder.password = password;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        RegisterBuilder.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        RegisterBuilder.lastName = lastName;
    }

    public static String getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(String birthDate) {
        RegisterBuilder.birthDate = birthDate;
    }

    public static String getReferralCode() {
        return referralCode;
    }

    public static void setReferralCode(String referralCode) {
        RegisterBuilder.referralCode = referralCode;
    }
}
