package com.goodie.sdk.android;

/**
 * Created by asep.surahman on 07/01/2019.
 */

public class Goodie {

    public static GoodieCore.SetUserBuilder setLogin(String userEmail, String password) {
        return GoodieCore.setUser(userEmail, password);
    }

}
