package com.goodie.sdk.android.data.builder;
import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetLoginListener;
import com.goodie.sdk.android.data.response.LoginResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 13/02/2019.
 */

public class LoginBuilder {

    private String password;
    private String username;
    private String memberId;

    public LoginBuilder(String username, String password, String memberId){
        this.username = username;
        this.password = password;
        this.memberId = memberId;
    }

    public void loginGoodie(Context context, SetLoginListener listener){
        loginObserv(username,  password,  memberId, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<LoginResponse> loginObserv(String username, String password, String memberId, Context context){
        return GoodieApis.getInstance().doLogin(username, password, memberId, context);
    }

}
