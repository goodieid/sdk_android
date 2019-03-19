package com.goodie.sdk.android.data.api;
import com.goodie.sdk.android.data.response.AbstractResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONObject;

/**
 * Created by asep.surahman on 10/01/2019.
 */

final class GoodieApiParser {

    static AbstractResponse parseGoodieAuth(JsonElement jsonElement) {
        JsonObject jsonAccount = jsonElement.getAsJsonObject().get("authenticationTokens").getAsJsonObject().get("abstractResponse").getAsJsonObject();
        return parseGooieAbstractResponse(jsonAccount);
    }

    static AbstractResponse parseGooieAbstractResponse(JsonObject jsonAccount){
        AbstractResponse abstractResponse = new AbstractResponse();
        abstractResponse.setResponseStatus(jsonAccount.get("responseStatus").getAsString());
        abstractResponse.setResponseMessage(jsonAccount.get("responseMessage").getAsString());
        return abstractResponse;
    }



}
