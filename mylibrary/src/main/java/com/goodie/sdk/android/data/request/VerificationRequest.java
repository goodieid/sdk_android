package com.goodie.sdk.android.data.request;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */

public class VerificationRequest {

    @SerializedName("username")
    private String username;

    @SerializedName("merchantId")
    private String merchantId;

    @SerializedName("code")
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString(){
        return
                "VerificationReq{" +
                        "username = '" + username + '\'' +
                        "code = '" + code + '\'' +
                        ",merchantId = '" + merchantId + '\'' +
                        "}";
    }

    /*{
        "username" : "macanyoha@gmail.com",
            "code" : "1234",
            "merchantId" : "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20"
    }*/
}
