package com.goodie.sdk.android;
import android.app.Application;
import android.graphics.Color;
import android.support.annotation.RestrictTo;
import android.widget.Toast;

import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.request.LoginRequest;
import com.goodie.sdk.android.data.response.LoginResponse;
import org.json.JSONObject;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by asep.surahman on 09/01/2019.
 */

public class GoodieCore{

    GoodieCore(){

    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    public static void initWithCustomServer(Application application, String qiscusAppId, String serverBaseUrl, String mqttBrokerUrl, boolean enableMqttLB){

    }

    public static SetUserBuilder setUser(String userEmail, String userKey) {
        return new SetUserBuilder(userEmail, userKey);
    }


    public interface SetUserListener {
        void onSuccess(LoginResponse loginResponse);
        void onError(Throwable throwable);
    }

    public static class SetUserBuilder {

        private String email;
        private String password;
        private String username;
        private String avatarUrl;
        private JSONObject extras;

        private SetUserBuilder(String email, String password) {
            this.email = email;
            this.password = password;
            this.username = email;
        }


        public SetUserBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public JSONObject getExtras() {
            return extras;
        }

        public void setExtras(JSONObject extras) {
            this.extras = extras;
        }

        public void loginGoodie(LoginRequest request){
            loginObs(request).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<LoginResponse>(){
                        @Override
                        public void onCompleted(){

                        }

                        @Override
                        public void onError(Throwable e){

                        }

                        @Override
                        public void onNext(final LoginResponse loginResponse){

                        }
                    });
        }



        public Observable<LoginResponse> loginObs(LoginRequest loginRequest){
            return GoodieApis.getInstance().loginOrRegister(loginRequest);
        }



    }



}