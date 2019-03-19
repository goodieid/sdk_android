package com.goodie.sdk.android.data.listener;

import com.goodie.sdk.android.data.response.LoginResponse;

/**
 * Created by asep.surahman on 16/01/2019.
 */

public interface SetLoginListener {
    void onSuccess(LoginResponse loginResponse);
    void onError(Throwable throwable);
}
