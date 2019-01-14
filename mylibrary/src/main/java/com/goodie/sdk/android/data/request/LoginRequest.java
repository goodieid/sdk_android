package com.goodie.sdk.android.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class LoginRequest {

    @SerializedName("password")
    private String password;

    @SerializedName("deviceUniqueId")
    private String deviceUniqueId;

    @SerializedName("username")
    private String username;

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

    @Override
    public String toString(){
        return
                "LoginReq{" +
                        "password = '" + password + '\'' +
                        ",deviceUniqueId = '" + deviceUniqueId + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }
}
