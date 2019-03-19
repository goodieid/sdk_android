package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 15/02/2019.
 */

public class CustomRulePointsResp {

    @SerializedName("customRuleName")
    private String customRuleName;

    @SerializedName("customRulePoint")
    private int customRulePoint;

    public String getCustomRuleName() {
        return customRuleName;
    }

    public void setCustomRuleName(String customRuleName) {
        this.customRuleName = customRuleName;
    }

    public int getCustomRulePoint() {
        return customRulePoint;
    }

    public void setCustomRulePoint(int customRulePoint) {
        this.customRulePoint = customRulePoint;
    }
}
