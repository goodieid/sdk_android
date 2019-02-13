package com.goodie.sdk.android.data.builder;


/**
 * Created by Goodie on 13/02/2019.
 */

public class LoginBuilder {

    public static String password;
    public static String username;
    public static String memberId;

    public LoginBuilder(String password, String username, String memberId){
        LoginBuilder.password = password;
        LoginBuilder.username = username;
        LoginBuilder.memberId = memberId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        LoginBuilder.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        LoginBuilder.username = username;
    }

    public static String getMemberId() {
        return memberId;
    }

    public static void setMemberId(String memberId) {
        LoginBuilder.memberId = memberId;
    }
}
