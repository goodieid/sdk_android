package com.goodie.sdk.android.data.request;
import com.goodie.sdk.android.data.bean.PromoInqCustomAmountReq;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * Created by Goodie on 15/02/2019.
 */

public class PromoInqCustomAmountRequest {

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("storeId")
    private String storeId;

    @SerializedName("custom")
    @Expose
    private ArrayList<PromoInqCustomAmountReq> promoInqCustomAmountReqs;

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

    public ArrayList<PromoInqCustomAmountReq> getPromoInqCustomAmountReqs() {
        return promoInqCustomAmountReqs;
    }

    public void setPromoInqCustomAmountReqs(ArrayList<PromoInqCustomAmountReq> promoInqCustomAmountReqs) {
        this.promoInqCustomAmountReqs = promoInqCustomAmountReqs;
    }

}
