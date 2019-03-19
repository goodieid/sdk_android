package com.goodie.sdk.android.data.listener;
import com.goodie.sdk.android.data.response.PromoInqBasicResponse;

/**
 * Created by Goodie on 14/02/2019.
 */

public interface SetPromotionInquiryBasicListener {
    void onSuccess(PromoInqBasicResponse promoInqBasicResponse);
    void onError(Throwable throwable);
}
