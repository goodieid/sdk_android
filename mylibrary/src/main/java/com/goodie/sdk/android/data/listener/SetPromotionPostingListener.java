package com.goodie.sdk.android.data.listener;
import com.goodie.sdk.android.data.response.PromotionPostingResponse;

/**
 * Created by Goodie on 18/02/2019.
 */

public interface SetPromotionPostingListener {
    void onSuccess(PromotionPostingResponse promotionPostingResponse);
    void onError(Throwable throwable);
}
