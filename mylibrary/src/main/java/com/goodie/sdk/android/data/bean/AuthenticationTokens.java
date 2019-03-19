package com.goodie.sdk.android.data.bean;
import com.goodie.sdk.android.data.response.GenericResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class AuthenticationTokens extends GenericResponse {

    @SerializedName("authtokenResponse")
    @Expose
    private AuthTokenResp authtokenResponse;

}
