package com.goodie.sdk.android.data.listener;
import com.goodie.sdk.android.data.response.MemberPointResponse;

/**
 * Created by asep.surahman on 16/01/2019.
 */

public interface SetMemberPointListener {
    void onSuccess(MemberPointResponse memberPointResponse);
    void onError(Throwable throwable);
}
