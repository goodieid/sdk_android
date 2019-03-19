package com.goodie.sdk.android.data.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class AbstractResponse {

    @SerializedName("responseStatus")
    @Expose
    private String responseStatus;
    @SerializedName("responseMessage")
    @Expose
    private String responseMessage;

    public String getResponseStatus(){
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
