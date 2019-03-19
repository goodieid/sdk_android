package com.goodie.sdk.android.data.listener;
import com.goodie.sdk.android.data.response.PromotionInquiryResponse;

/**
 * Created by Goodie on 18/02/2019.
 */

public interface SetPromotionInquiryListener {
    void onSuccess(PromotionInquiryResponse promotionInquiryResponse);
    void onError(Throwable throwable);
}
