package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class AuthTokenResp {

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("gender")
    private String gender;

    @SerializedName("authDevice")
    private String authDevice;

    @SerializedName("userPic")
    private String userPic;

    @SerializedName("backgroundImage")
    private String backgroundImage;

    @SerializedName("authToken")
    private String authToken;

    @SerializedName("storeId")
    private Object storeId;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("point")
    private int point;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("expiryTime")
    private String expiryTime;

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("status")
    private int status;

    @SerializedName("qrImage")
    private String qrImage;

    @SerializedName("vaNumber")
    private String vaNumber;

    @SerializedName("vaNumber2")
    private String vaNumber2;

    @SerializedName("birthPlace")
    @Expose
    private String birthPlace;

    @SerializedName("idNumber")
    @Expose
    private String idNumber;

    @SerializedName("motherName")
    @Expose
    private String motherName;

    @SerializedName("email")
    private String email;

    @SerializedName("isCorporateMember")
    private int isCorporateMember;

    @SerializedName("referralCode")
    private String referralCode;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthDevice() {
        return authDevice;
    }

    public void setAuthDevice(String authDevice) {
        this.authDevice = authDevice;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
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

    public String getVaNumber() {
        return vaNumber;
    }

    public void setVaNumber(String vaNumber) {
        this.vaNumber = vaNumber;
    }

    public String getVaNumber2() {
        return vaNumber2;
    }

    public void setVaNumber2(String vaNumber2) {
        this.vaNumber2 = vaNumber2;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsCorporateMember() {
        return isCorporateMember;
    }

    public void setIsCorporateMember(int isCorporateMember) {
        this.isCorporateMember = isCorporateMember;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
}
