package com.goodie.sdk.android;
import android.app.Application;
import android.content.Context;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.response.LoginResponse;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
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


        public void loginGoodie(SetUserListener listener, Context context){
            loginObsev(username, password, context)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(listener::onSuccess, listener::onError);
        }


        public Observable<LoginResponse> loginObsev(String username, String password, Context context){
            return GoodieApis.getInstance().loginOrRegister(username, password, context);
        }

    }



}
