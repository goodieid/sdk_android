package com.goodie.sdk.android.data.builder;
import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetPromotionInquiryBasicListener;
import com.goodie.sdk.android.data.response.PromoInqBasicResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 21/02/2019.
 */

public class PromotionInquiryCustomByAmountBuilder {

    private String memberId;
    private String merchantId;
    private String storeId;
    private String ruleName;
    private int issuing;
    private Double amount;
    private String refNumber;

    public PromotionInquiryCustomByAmountBuilder(
            String memberId,
            String merchantId,
            String storeId,
            String ruleName,
            int issuing,
            Double amount,
            String refNumber){
        this.memberId = memberId;
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.ruleName = ruleName;
        this.issuing = issuing;
        this.amount = amount;
        this.refNumber = refNumber;
    }

    public void promotionInquiryCustomByAmountGoodie(Context context, SetPromotionInquiryBasicListener listener){
        promoInqCustomByAmountObserv(memberId, merchantId, storeId, ruleName, issuing, amount, refNumber, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<PromoInqBasicResponse> promoInqCustomByAmountObserv(String memberId, String merchantId, String storeId,
                                                                         String ruleName, int issuing, Double amount, String refNumber, Context context){
        return GoodieApis.getInstance().doPromoInquiryCustomByAmount(memberId, merchantId, storeId, ruleName, issuing, amount, refNumber, context);
    }


}
