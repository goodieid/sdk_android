package com.goodie.sdk.android.data.builder;

import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.bean.BasicRulesReq;
import com.goodie.sdk.android.data.bean.CustomRulesReq;
import com.goodie.sdk.android.data.listener.SetPromotionInquiryListener;
import com.goodie.sdk.android.data.response.PromotionInquiryResponse;
import java.util.List;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 18/02/2019.
 */

public class PromotionInquiryBuilder {

    private String memberId;
    private String merchantId;
    private String storeId;
    private BasicRulesReq basicRulesReqs;
    private List<CustomRulesReq> customRulesReqs;

    public PromotionInquiryBuilder(String memberId, String merchantId, String storeId,
                                    BasicRulesReq basicRulesReqs, List<CustomRulesReq> customRulesReqs){
        this.memberId = memberId;
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.basicRulesReqs = basicRulesReqs;
        this.customRulesReqs = customRulesReqs;
    }


    public void promotionInquiryGoodie(Context context, SetPromotionInquiryListener listener){
        promoInquiryObserv(memberId, merchantId, storeId, basicRulesReqs, customRulesReqs, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<PromotionInquiryResponse> promoInquiryObserv(String memberId, String merchantId, String storeId,
                                                                    BasicRulesReq basicRulesReq, List<CustomRulesReq> customRulesReqs, Context context){
        return GoodieApis.getInstance().doPromotionInquiry(memberId, merchantId, storeId, basicRulesReq, customRulesReqs, context);
    }


}
