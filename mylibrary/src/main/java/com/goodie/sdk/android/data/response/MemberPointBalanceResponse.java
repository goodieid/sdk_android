package com.goodie.sdk.android.data.response;
import com.goodie.sdk.android.data.bean.MemberPointBalance;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asep.surahman on 15/01/2019.
 */

public class MemberPointBalanceResponse extends GenericResponse {

    @SerializedName("totalPoints")
    private int totalPoints;

    @SerializedName("memberName")
    private String memberName;

    @SerializedName("memberBalanceResponse")
    @Expose
    private List<MemberPointBalance> memberBalanceResponse = new ArrayList<MemberPointBalance>();

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<MemberPointBalance> getMemberBalanceResponse() {
        return memberBalanceResponse;
    }

    public void setMemberBalanceResponse(List<MemberPointBalance> memberBalanceResponse) {
        this.memberBalanceResponse = memberBalanceResponse;
    }

    @Override
    public String toString(){
        return
                "MemberPointBalanceResponse{" +
                        "totalPoints = '" + totalPoints + '\'' +
                        ",memberName = '" + memberName + '\'' +
                        "}";
    }

}
