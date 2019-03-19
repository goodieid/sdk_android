package com.goodie.sdk.android.data.request;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */

public class MemberPointRequest {

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

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

    @Override
    public String toString(){
        return
                "MemberPointReq{" +
                        "memberId = '" + memberId + '\'' +
                        ",merchantId = '" + merchantId + '\'' +
                        "}";
    }

    /*{
        "memberId" : "D6D321EB-3EB2-44DE-910B-04D58F2D6817",
            "merchantId" : "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20"
    }*/

}
