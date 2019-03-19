package com.goodie.sdk.android.data.request;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */

public class RegisterRequest {

    @SerializedName("username")
    private String username;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("password")
    private String password;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("deviceUniqueId")
    private String deviceUniqueId;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("referralCode")
    private String referralCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }

    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    @Override
    public String toString(){
        return
                "RegisterReq{" +
                        "username = '" + username + '\'' +
                        ",merchantId = '" + merchantId + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",password = '" + password + '\'' +
                        ",firstName = '" + firstName + '\'' +
                        ",lastName = '" + lastName + '\'' +
                        ",deviceUniqueId = '" + deviceUniqueId + '\'' +
                        ",birthDate = '" + birthDate + '\'' +
                        ",referralCode = '" + referralCode + '\'' +
                        "}";
    }

    /*{
        "username" : "macan3@gmail.com",
            "merchantId" : "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20",
            "phoneNumber" : "082697968906",
            "password" : "password",
            "firstName" : "Macan",
            "lastName" : "Yohan",
            "deviceUniqueId" : "tokenttokenan",
            "birthDate" : "15-09-1992",
            "referralCode" : "mac552BW"
    }*/


}
