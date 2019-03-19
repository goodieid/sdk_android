package com.goodie.sdk.android.data.request;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class LoginRequest {

    @SerializedName("deviceUniqueId")
    private String deviceUniqueId;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("merchantId")
    private String merchantId;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }

    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }

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

    @Override
    public String toString(){
        return
                "LoginReq{" +
                        "password = '" + password + '\'' +
                        ",deviceUniqueId = '" + deviceUniqueId + '\'' +
                        ",merchantId = '" + merchantId + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }

    /*
    {
        "deviceUniqueId": "tokentokenan",
            "username" : "macan3@gmail.com",
            "password" : "password",
            "merchantId" : "5F773EA1-1E66-4F9E-B9C8-E1FA8156AD20"
    }*/
}
