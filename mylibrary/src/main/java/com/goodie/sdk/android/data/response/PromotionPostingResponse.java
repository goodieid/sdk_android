package com.goodie.sdk.android.data.response;
import com.goodie.sdk.android.data.bean.PromotionNumberIssuedResp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Goodie on 18/02/2019.
 */

public class PromotionPostingResponse extends GenericResponse {

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("memberName")
    private String memberName;

    @SerializedName("storeId")
    private String storeId;

    @SerializedName("transactionDate")
    private String transactionDate;

    @SerializedName("transactionId")
    private String transactionId;

    @SerializedName("totalPointIssuing")
    private int totalPointIssuing;

    @SerializedName("promotionNumberIssued")
    @Expose
    private List<PromotionNumberIssuedResp> promotionNumberIssuedReqs;

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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getTotalPointIssuing() {
        return totalPointIssuing;
    }

    public void setTotalPointIssuing(int totalPointIssuing) {
        this.totalPointIssuing = totalPointIssuing;
    }

    public List<PromotionNumberIssuedResp> getPromotionNumberIssuedReqs() {
        return promotionNumberIssuedReqs;
    }

    public void setPromotionNumberIssuedReqs(List<PromotionNumberIssuedResp> promotionNumberIssuedReqs) {
        this.promotionNumberIssuedReqs = promotionNumberIssuedReqs;
    }
}
