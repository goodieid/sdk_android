package com.goodie.sdk.android;
import android.app.Application;
import android.content.Context;
import android.support.annotation.RestrictTo;
import com.goodie.sdk.android.data.api.GoodieApis;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;
import com.goodie.sdk.android.data.response.LoginResponse;
import com.goodie.sdk.android.data.response.MemberPointBalanceResponse;
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

    public static SetMemberPointBuilder setMemberPointBuilder(String contentType, String authToken, CheckMemberPointsReq request){
        return new SetMemberPointBuilder(contentType, authToken, request);
    }

    public interface SetUserListener {
        void onSuccess(LoginResponse loginResponse);
        void onError(Throwable throwable);
    }

    public interface SetMemberPointListener {
        void onSuccess(MemberPointBalanceResponse loginResponse);
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

        public void loginGoodie(Context context, SetUserListener listener){
            loginObsev(username, password, context)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(listener::onSuccess, listener::onError);
        }


        public Observable<LoginResponse> loginObsev(String username, String password, Context context){
            return GoodieApis.getInstance().loginOrRegister(username, password, context);
        }

    }


    public static class SetMemberPointBuilder{

        private String contentType;
        private String authToken;
        private CheckMemberPointsReq checkMemberPointsReq;

         private SetMemberPointBuilder(String contentType, String authToken, CheckMemberPointsReq request) {
            this.contentType = contentType;
            this.authToken = authToken;
            this.checkMemberPointsReq = request;
        }

        public void memberPointGoodie(Context context, SetMemberPointListener listener){
            memberPointObsev(contentType, authToken, context, checkMemberPointsReq)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(listener::onSuccess, listener::onError);
        }

        public Observable<MemberPointBalanceResponse> memberPointObsev(String contentType, String authToken, Context context, CheckMemberPointsReq req){
            return GoodieApis.getInstance().memberPoint(contentType, authToken, context, req);
        }

    }






}
