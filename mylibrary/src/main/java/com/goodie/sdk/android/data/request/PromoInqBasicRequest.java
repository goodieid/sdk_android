package com.goodie.sdk.android.data.request;
import com.goodie.sdk.android.data.bean.BasicRulesReq;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 14/02/2019.
 */

public class PromoInqBasicRequest {

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("storeId")
    private String storeId;

    @SerializedName("basic")
    @Expose
    private BasicRulesReq basicRulesReq;

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

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public BasicRulesReq getBasicRulesReq() {
        return basicRulesReq;
    }

    public void setBasicRulesReq(BasicRulesReq basicRulesReq) {
        this.basicRulesReq = basicRulesReq;
    }

    /*{
        "memberId" : "D6D321EB-3EB2-44DE-910B-04D58F2D6817",
            "merchantId" : "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20",
            "storeId" : "36C86E1D-A7D3-42B2-A5D4-6E3EDD78791B",
            "basic" :
        {
            "productCode": "",
                "totalTrxAmount" : 100000,
                "refNumber" : "INV001TEST"
        }
    }*/

}
