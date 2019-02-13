package com.goodie.sdk.android.data.builder;

import android.content.Context;

import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetMemberPointListener;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;
import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 13/02/2019.
 */

public class MemberPointBuilder {

    private String contentType;
    private String authToken;
    private CheckMemberPointsReq checkMemberPointsReq;

    public MemberPointBuilder(String contentType, String authToken, CheckMemberPointsReq checkMemberPointsReq){
        this.contentType = contentType;
        this.authToken = authToken;
        this.checkMemberPointsReq = checkMemberPointsReq;
    }

    public void memberPointGoodie(Context context, SetMemberPointListener listener){
        memberPointObserv(contentType, authToken, context, checkMemberPointsReq)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<MemberPointBalanceResponse> memberPointObserv(String contentType, String authToken, Context context, CheckMemberPointsReq req){
        return GoodieApis.getInstance().doMemberPoint(contentType, authToken, context, req);
    }


}
