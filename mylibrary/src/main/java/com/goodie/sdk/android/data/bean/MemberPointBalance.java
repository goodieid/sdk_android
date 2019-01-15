package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asep.surahman on 15/01/2019.
 */

public class MemberPointBalance  {

    @SerializedName("nearestPointToBeExpire")
    private int nearestPointToBeExpire;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("memberName")
    private String memberName;

    @SerializedName("availablePoint")
    private int availablePoint;

    @SerializedName("nearestExpiredDate")
    private String nearestExpiredDate;

    @SerializedName("username")
    private String username;

    @SerializedName("merchantName")
    private String merchantName;

    @SerializedName("memberBalanceDetailResponse")
    @Expose
    private List<MemberPointBalanceDetail> memberBalanceDetailResponse = new ArrayList<MemberPointBalanceDetail>();

    public int getNearestPointToBeExpire() {
        return nearestPointToBeExpire;
    }

    public void setNearestPointToBeExpire(int nearestPointToBeExpire) {
        this.nearestPointToBeExpire = nearestPointToBeExpire;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getAvailablePoint() {
        return availablePoint;
    }

    public void setAvailablePoint(int availablePoint) {
        this.availablePoint = availablePoint;
    }

    public String getNearestExpiredDate() {
        return nearestExpiredDate;
    }

    public void setNearestExpiredDate(String nearestExpiredDate) {
        this.nearestExpiredDate = nearestExpiredDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public List<MemberPointBalanceDetail> getMemberBalanceDetailResponse() {
        return memberBalanceDetailResponse;
    }

    public void setMemberBalanceDetailResponse(List<MemberPointBalanceDetail> memberBalanceDetailResponse) {
        this.memberBalanceDetailResponse = memberBalanceDetailResponse;
    }

    @Override
    public String toString(){
        return
                "MemberPointBalance{" +
                        "nearestPointToBeExpire = '" + nearestPointToBeExpire + '\'' +
                        ",merchantId = '" + merchantId + '\'' +
                        ",memberName = '" + memberName + '\'' +
                        ",availablePoint = '" + availablePoint + '\'' +
                        ",nearestExpiredDate = '" + nearestExpiredDate + '\'' +
                        ",username = '" + username + '\'' +
                        ",merchantName = '" + merchantName + '\'' +
                        "}";
    }
}
