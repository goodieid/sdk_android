package com.goodie.sdk.android.data.builder;

import android.content.Context;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.listener.SetRegisterListener;
import com.goodie.sdk.android.data.response.RegisterResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Goodie on 13/02/2019.
 */

public class RegisterBuilder {

    private String username;
    private String merchantId;
    private String phoneNumber;
    private String password;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String referralCode;

    public RegisterBuilder(String username, String merchantId, String phoneNumber, String password,
                           String firstName, String lastName, String birthDate, String referralCode){
        this.username = username;
        this.merchantId = merchantId;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.referralCode = referralCode;
    }

    public void regiterGoodie(Context context, SetRegisterListener listener){
        registerObserv(username, merchantId, phoneNumber, password, firstName,
                       lastName, birthDate, referralCode, context)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listener::onSuccess, listener::onError);
    }

    public Observable<RegisterResponse> registerObserv(String username, String merchantId, String phoneNumber,
                                                       String password, String firstName, String lastName,
                                                       String birthDate, String referralCode, Context context){
        return GoodieApis.getInstance().doRegister(username, merchantId, phoneNumber, password, firstName, lastName,
                birthDate, referralCode, context);
    }
}
