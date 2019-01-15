package com.goodie.sdk.android;
import com.goodie.sdk.android.data.request.CheckMemberPointsReq;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class Goodie {

    public static GoodieCore.SetUserBuilder setLogin(String userEmail, String password) {
        return GoodieCore.setUser(userEmail, password);
    }

    public static GoodieCore.SetMemberPointBuilder setMemberPoint(String contentType,
                                                                  String authToken,
                                                                  CheckMemberPointsReq request){
        return GoodieCore.setMemberPointBuilder(contentType, authToken, request);
    }


}
