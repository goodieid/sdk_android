package com.goodie.sdk.android.data.bean;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by asep.surahman on 14/01/2019.
 */

public class GoodieAccount implements Parcelable{


    public static final Creator<GoodieAccount> CREATOR = new Creator<GoodieAccount>() {
        @Override
        public GoodieAccount createFromParcel(Parcel in){
            return new GoodieAccount(in);
        }

        @Override
        public GoodieAccount[] newArray(int size) {
            return new GoodieAccount[size];
        }
    };


    protected String authToken;
    protected String memberId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected int point;


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public GoodieAccount() {
    }

    protected GoodieAccount(Parcel in) {
        point = in.readInt();
        email = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        authToken = in.readString();
        memberId = in.readString();
    }



    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(point);
        dest.writeString(email);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(authToken);
        dest.writeString(memberId);
    }


    @Override
    public int hashCode() {
        int result = point;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (authToken != null ? authToken.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof GoodieAccount && point == (((GoodieAccount) o).point);
    }

    @Override
    public String toString() {
        return "GoodieAccount{" +
                "point=" + point +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", authToken='" + authToken + '\'' +
                ", memberId=" + memberId +
                '}';
    }


}
