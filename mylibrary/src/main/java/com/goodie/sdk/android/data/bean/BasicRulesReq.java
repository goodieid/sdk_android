package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 14/02/2019.
 */

public class BasicRulesReq {

    @SerializedName("productCode")
    private String productCode;

    @SerializedName("refNumber")
    private String refNumber;

    @SerializedName("totalTrxAmount")
    private Double totalTrxAmount;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public Double getTotalTrxAmount() {
        return totalTrxAmount;
    }

    public void setTotalTrxAmount(Double totalTrxAmount) {
        this.totalTrxAmount = totalTrxAmount;
    }

    /*"basic" :
    {
        "productCode": "",
            "totalTrxAmount" : 100000,
            "refNumber" : "INV001TEST"
    }*/

}
