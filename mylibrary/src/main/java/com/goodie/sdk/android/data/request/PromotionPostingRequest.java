package com.goodie.sdk.android.data.request;
import com.goodie.sdk.android.data.bean.BasicRulesReq;
import com.goodie.sdk.android.data.bean.CustomRulesReq;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Goodie on 18/02/2019.
 */

public class PromotionPostingRequest {

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("storeId")
    private String storeId;

    @SerializedName("basic")
    @Expose
    private BasicRulesReq basicRulesReq;

    @SerializedName("custom")
    @Expose
    private List<CustomRulesReq> customRulesReqs;

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

    public List<CustomRulesReq> getCustomRulesReqs() {
        return customRulesReqs;
    }

    public void setCustomRulesReqs(List<CustomRulesReq> customRulesReqs) {
        this.customRulesReqs = customRulesReqs;
    }
}
