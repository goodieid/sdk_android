package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 15/02/2019.
 */

public class PromoInqCustomAmountReq {

    @SerializedName("ruleName")
    private String ruleName;

    @SerializedName("issuing")
    private int issuing;

    @SerializedName("amount")
    private Double totalTrxAmount;

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public int getIssuing() {
        return issuing;
    }

    public void setIssuing(int issuing) {
        this.issuing = issuing;
    }

    public Double getTotalTrxAmount() {
        return totalTrxAmount;
    }

    public void setTotalTrxAmount(Double totalTrxAmount) {
        this.totalTrxAmount = totalTrxAmount;
    }
}
