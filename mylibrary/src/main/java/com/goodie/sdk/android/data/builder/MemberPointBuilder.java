package com.goodie.sdk.android.data.builder;

import com.goodie.sdk.android.data.request.CheckMemberPointsReq;

/**
 * Created by Goodie on 13/02/2019.
 */

public class MemberPointBuilder {

    public static String contentType;
    public static String authToken;
    public static CheckMemberPointsReq checkMemberPointsReq;

    public MemberPointBuilder(String contentType, String authToken, CheckMemberPointsReq checkMemberPointsReq){
        MemberPointBuilder.contentType = contentType;
        MemberPointBuilder.authToken = authToken;
        MemberPointBuilder.checkMemberPointsReq = checkMemberPointsReq;
    }

    public static String getContentType() {
        return contentType;
    }

    public static void setContentType(String contentType) {
        MemberPointBuilder.contentType = contentType;
    }

    public static String getAuthToken() {
        return authToken;
    }

    public static void setAuthToken(String authToken) {
        MemberPointBuilder.authToken = authToken;
    }

    public static CheckMemberPointsReq getCheckMemberPointsReq() {
        return checkMemberPointsReq;
    }

    public static void setCheckMemberPointsReq(CheckMemberPointsReq checkMemberPointsReq) {
        MemberPointBuilder.checkMemberPointsReq = checkMemberPointsReq;
    }
}
