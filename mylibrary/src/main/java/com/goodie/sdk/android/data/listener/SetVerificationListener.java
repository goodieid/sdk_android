package com.goodie.sdk.android.data.listener;
import com.goodie.sdk.android.data.response.VerificationResponse;

/**
 * Created by Goodie on 13/02/2019.
 */

public interface SetVerificationListener {
    void onSuccess(VerificationResponse verificationResponse);
    void onError(Throwable throwable);
}
