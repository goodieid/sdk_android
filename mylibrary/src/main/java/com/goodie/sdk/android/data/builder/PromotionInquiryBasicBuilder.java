package com.goodie.sdk.android.data.builder;
import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetPromotionInquiryBasicListener;
import com.goodie.sdk.android.data.response.PromoInqBasicResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 14/02/2019.
 */

public class PromotionInquiryBasicBuilder {

    private String memberId;
    private String merchantId;
    private String storeId;
    private String productCode;
    private String refNumber;
    private Double totalTrxAmount;

    public PromotionInquiryBasicBuilder(String memberId, String merchantId, String storeId,
                                        String productCode, String refNumber, Double totalTrxAmount){
        this.memberId = memberId;
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.productCode = productCode;
        this.refNumber = refNumber;
        this.totalTrxAmount = totalTrxAmount;
    }

    public void promotionInquiryBasicGoodie(Context context, SetPromotionInquiryBasicListener listener){
        promoInqBasicObserv(memberId, merchantId, storeId, productCode, refNumber, totalTrxAmount, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<PromoInqBasicResponse> promoInqBasicObserv(String memberId, String merchantId, String storeId,
                                                                 String productCode, String refNumber, Double totalTrxAmount, Context context){
        return GoodieApis.getInstance().doPromoInquiryBasic(memberId, merchantId, storeId, productCode, refNumber, totalTrxAmount, context);
    }


}
