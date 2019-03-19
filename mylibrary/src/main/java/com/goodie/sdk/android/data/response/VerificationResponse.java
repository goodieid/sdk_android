package com.goodie.sdk.android.data.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Goodie on 13/02/2019.
 */

public class VerificationResponse extends GenericResponse{

    @SerializedName("referralPoint")
    private int referralPoint;

    public int getReferralPoint() {
        return referralPoint;
    }

    public void setReferralPoint(int referralPoint) {
        this.referralPoint = referralPoint;
    }

    /*{
        "referralPoint": 0,
            "abstractResponse": {
        "responseStatus": "MEM000",
                "responseMessage": "Register member with Verify Code Success"
    }
    }*/

}
