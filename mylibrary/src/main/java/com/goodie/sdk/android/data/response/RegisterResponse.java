package com.goodie.sdk.android.data.response;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */


public class RegisterResponse extends GenericResponse{

    @SerializedName("memberId")
    private String memberId;

    @SerializedName("referralPoint")
    private int referralPoint;

    /*{
        "memberId": "476D9767-BC71-480F-BBF3-C25495184FF9",
            "referralPoint": 1,
            "abstractResponse": {
        "responseStatus": "MEM000",
                "responseMessage": "Register member success"
    }
    }*/

}
