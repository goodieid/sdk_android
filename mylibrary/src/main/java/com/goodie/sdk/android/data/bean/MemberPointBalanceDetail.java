package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 15/01/2019.
 */

public class MemberPointBalanceDetail {

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("memberName")
    private String memberName;

    @SerializedName("availablePoint")
    private String availablePoint;

    @SerializedName("expireDate")
    private String expireDate;

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantName")
    private String merchantName;

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

    public String getAvailablePoint() {
        return availablePoint;
    }

    public void setAvailablePoint(String availablePoint) {
        this.availablePoint = availablePoint;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }


    @Override
    public String toString(){
        return
                "MemberPointBalanceDetail{" +
                        "merchantId = '" + merchantId + '\'' +
                        ",memberName = '" + memberName + '\'' +
                        ",availablePoint = '" + availablePoint + '\'' +
                        ",expireDate = '" + expireDate + '\'' +
                        ",memberId = '" + memberId + '\'' +
                        ",merchantName = '" + merchantName + '\'' +
                        "}";
    }

}
