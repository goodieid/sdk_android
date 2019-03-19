package com.goodie.sdk.android.data.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Goodie on 14/02/2019.
 */

public class PromotionNumberIssuedResp {


    @SerializedName("promotionCode")
    @Expose
    private String promotionCode;

    @SerializedName("promotionName")
    @Expose
    private String promotionName;

    @SerializedName("basicRuleName")
    @Expose
    private String basicRuleName;

    @SerializedName("basicRulePoint")
    @Expose
    private int basicRulePoint;

    @SerializedName("customRulePoints")
    @Expose
    private List<CustomRulePointsResp> customRulePoints;


    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getBasicRuleName() {
        return basicRuleName;
    }

    public void setBasicRuleName(String basicRuleName) {
        this.basicRuleName = basicRuleName;
    }

    public int getBasicRulePoint() {
        return basicRulePoint;
    }

    public void setBasicRulePoint(int basicRulePoint) {
        this.basicRulePoint = basicRulePoint;
    }

    public List<CustomRulePointsResp> getCustomRulePoints() {
        return customRulePoints;
    }

    public void setCustomRulePoints(List<CustomRulePointsResp> customRulePoints) {
        this.customRulePoints = customRulePoints;
    }

  /*"promotionCode": "PRM32016001",
            "promotionName": "Unbelievable 2017",
            "basicRuleName": "Unbelievable 2016",
            "basicRulePoint": 10,
            "customRulePoints": []*/

}
