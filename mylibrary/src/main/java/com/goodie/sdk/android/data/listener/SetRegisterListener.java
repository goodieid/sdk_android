package com.goodie.sdk.android.data.listener;

import com.goodie.sdk.android.data.response.RegisterResponse;

/**
 * Created by Goodie on 13/02/2019.
 */

public interface SetRegisterListener {
    void onSuccess(RegisterResponse registerResponse);
    void onError(Throwable throwable);
}
