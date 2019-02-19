package com.goodie.sdk.android.data.builder;
import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetVerificationListener;
import com.goodie.sdk.android.data.response.VerificationResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 13/02/2019.
 */

public class VerificationBuilder {

    private String username;
    private String merchantId;
    private String code;

    public VerificationBuilder(String username, String merchantId, String code){
        this.username = username;
        this.merchantId = merchantId;
        this.code = code;
    }

    public void verificationGoodie(Context context, SetVerificationListener listener){
        verificationObserv(username, merchantId, code, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<VerificationResponse> verificationObserv(String username, String merchantId, String code, Context context){
        return GoodieApis.getInstance().doVerifation(username, merchantId, code, context);
    }


}
