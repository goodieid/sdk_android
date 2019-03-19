package com.goodie.sdk.android.data.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */

public class MemberPointResponse extends GenericResponse {

    @SerializedName("memberName")
    private String memberName;

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("tierName")
    private String tierName;

    @SerializedName("tierImage")
    private String tierImage;

    @SerializedName("nextTierName")
    private String nextTierName;

    @SerializedName("nextTierImage")
    private String nextTierImage;

    @SerializedName("reqPointNextTier")
    private int reqPointNextTier;

    @SerializedName("totalPoints")
    private int totalPoints;

    @SerializedName("nearestPointToBeExpire")
    private int nearestPointToBeExpire;

    @SerializedName("nearestExpiredDate")
    private String nearestExpiredDate;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public String getTierImage() {
        return tierImage;
    }

    public void setTierImage(String tierImage) {
        this.tierImage = tierImage;
    }

    public String getNextTierName() {
        return nextTierName;
    }

    public void setNextTierName(String nextTierName) {
        this.nextTierName = nextTierName;
    }

    public String getNextTierImage() {
        return nextTierImage;
    }

    public void setNextTierImage(String nextTierImage) {
        this.nextTierImage = nextTierImage;
    }

    public int getReqPointNextTier() {
        return reqPointNextTier;
    }

    public void setReqPointNextTier(int reqPointNextTier) {
        this.reqPointNextTier = reqPointNextTier;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getNearestPointToBeExpire() {
        return nearestPointToBeExpire;
    }

    public void setNearestPointToBeExpire(int nearestPointToBeExpire) {
        this.nearestPointToBeExpire = nearestPointToBeExpire;
    }

    public String getNearestExpiredDate() {
        return nearestExpiredDate;
    }

    public void setNearestExpiredDate(String nearestExpiredDate) {
        this.nearestExpiredDate = nearestExpiredDate;
    }


    @Override
    public String toString(){
        return
                "MemberPointResponse{" +
                        "memberName = '" + memberName + '\'' +
                        "memberId = '" + memberId + '\'' +
                        "merchantId = '" + merchantId + '\'' +
                        "tierName = '" + tierName + '\'' +
                        "tierImage = '" + tierImage + '\'' +
                        "nextTierName = '" + nextTierName + '\'' +
                        "nextTierImage = '" + nextTierImage + '\'' +
                        "reqPointNextTier = '" + reqPointNextTier + '\'' +
                        "totalPoints = '" + totalPoints + '\'' +
                        "nearestPointToBeExpire = '" + nearestPointToBeExpire + '\'' +
                        ",nearestExpiredDate = '" + nearestExpiredDate + '\'' +
                        "}";
    }

    /*{
        "memberName": "Macan Yohan",
            "memberId": "D6D321EB-3EB2-44DE-910B-04D58F2D6817",
            "merchantId": "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20",
            "tierName": "CLASSIC",
            "tierImage": "",
            "nextTierName": "SILVER",
            "nextTierImage": "",
            "reqPointNextTier": 4981,
            "totalPoints": 20,
            "nearestPointToBeExpire": 20,
            "nearestExpiredDate": "2020-02-03",
            "abstractResponse": {
        "responseStatus": "INQ000",
                "responseMessage": "Inquiry success"
    }
    }*/

}
