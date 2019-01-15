package com.goodie.sdk.android.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 15/01/2019.
 */

public class CheckMemberPointsReq {

    @SerializedName("nRecords")
    private int nRecords;

    @SerializedName("page")
    private int page;

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("order")
    private String order;

    public int getnRecords() {
        return nRecords;
    }

    public void setnRecords(int nRecords) {
        this.nRecords = nRecords;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString(){
        return
                "CheckMemberPointsReq{" +
                        "nRecords = '" + nRecords + '\'' +
                        ",page = '" + page + '\'' +
                        ",memberId = '" + memberId + '\'' +
                        ",order = '" + order + '\'' +
                        "}";
    }
}
