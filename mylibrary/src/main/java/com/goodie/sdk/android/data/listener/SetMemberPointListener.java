package com.goodie.sdk.android.data.listener;

import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;

/**
 * Created by asep.surahman on 16/01/2019.
 */

public interface SetMemberPointListener {
    void onSuccess(MemberPointBalanceResponse loginResponse);
    void onError(Throwable throwable);
}
