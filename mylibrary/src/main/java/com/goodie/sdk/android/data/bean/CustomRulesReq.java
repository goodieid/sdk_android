package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 18/02/2019.
 */

public class CustomRulesReq {

    @SerializedName("ruleName")
    private String ruleName;

    @SerializedName("issuing")
    private Integer issuing;

    @SerializedName("amount")
    private Double amount;

    @SerializedName("refNumber")
    private String refNumber;

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Integer getIssuing() {
        return issuing;
    }

    public void setIssuing(Integer issuing) {
        this.issuing = issuing;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }
}
