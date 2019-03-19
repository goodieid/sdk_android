package com.goodie.sdk.android.data.response;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class LoginResponse extends GenericResponse{

    @SerializedName("authToken")
    private String authToken;

    @SerializedName("authDevice")
    private String authDevice;

    @SerializedName("expiryTime")
    private String expiryTime;

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("gender")
    private String gender;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("status")
    private int status;

    @SerializedName("qrImage")
    private String qrImage;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthDevice() {
        return authDevice;
    }

    public void setAuthDevice(String authDevice) {
        this.authDevice = authDevice;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getQrImage() {
        return qrImage;
    }

    public void setQrImage(String qrImage) {
        this.qrImage = qrImage;
    }

    /*
    @SerializedName("authenticationTokens")
    @Expose
    private AuthenticationTokens authenticationTokens;

    public AuthenticationTokens getAuthenticationTokens(){
        return authenticationTokens;
    }

    public void setAuthenticationTokens(AuthenticationTokens authenticationTokens){
        this.authenticationTokens = authenticationTokens;
    }*/
}
