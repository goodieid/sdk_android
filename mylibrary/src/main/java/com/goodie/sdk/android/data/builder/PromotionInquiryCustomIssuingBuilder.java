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

public class PromotionInquiryCustomIssuingBuilder {

    private String memberId;
    private String merchantId;
    private String storeId;
    private String ruleName;
    private int issuing;
    private Double amount;
    private String refNumber;

    public PromotionInquiryCustomIssuingBuilder(
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


    public void promotionInquiryCustomIssuingGoodie(Context context, SetPromotionInquiryBasicListener listener){
        promoInqCustomIssuingObserv(memberId, merchantId, storeId, ruleName, issuing, amount, refNumber, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }


    public Observable<PromoInqBasicResponse> promoInqCustomIssuingObserv(String memberId, String merchantId, String storeId,
                                                                         String ruleName, int issuing, Double amount, String refNumber, Context context){
        return GoodieApis.getInstance().doPromoInquiryCustomIssuing(memberId, merchantId, storeId, ruleName, issuing, amount, refNumber, context);
    }


}
