package com.goodie.sdk.android.data.response;
import com.goodie.sdk.android.data.bean.AuthenticationTokens;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class LoginResponse {

    @SerializedName("authenticationTokens")
    @Expose
    private AuthenticationTokens authenticationTokens;

    public AuthenticationTokens getAuthenticationTokens(){
        return authenticationTokens;
    }

    public void setAuthenticationTokens(AuthenticationTokens authenticationTokens){
        this.authenticationTokens = authenticationTokens;
    }
}
