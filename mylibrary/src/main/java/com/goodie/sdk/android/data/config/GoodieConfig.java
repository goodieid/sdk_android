package com.goodie.sdk.android.data.config;
import android.support.annotation.ColorRes;
import com.goodie.sdk.android.R;

/**
 * Created by Goodie on 29/01/2019.
 */

public class GoodieConfig {

    private int statusBarColor = R.color.colorPrimaryDark;
    private int appBarColor = R.color.colorPrimary;
    private int accentColor = R.color.colorAccent;
    private int titleColor = R.color.black;
    private int textTitleColor = R.color.black;

    @ColorRes
    public int getStatusBarColor(){
        return statusBarColor;
    }

    public GoodieConfig setStatusBarColor(@ColorRes int statusBarColor){
        this.statusBarColor = statusBarColor;
        return this;
    }

    @ColorRes
    public int getAppBarColor(){
        return appBarColor;
    }

    public GoodieConfig setAppBarColor(@ColorRes int appBarColor){
        this.appBarColor = appBarColor;
        return this;
    }

    @ColorRes
    public int getAccentColor(){
        return accentColor;
    }

    public GoodieConfig setAccentColor(@ColorRes int accentColor){
        this.accentColor = accentColor;
        return this;
    }

    @ColorRes
    public int getTitleColor(){
        return titleColor;
    }

    public GoodieConfig setTitleColor(@ColorRes int titleColor){
        this.titleColor = titleColor;
        return this;
    }

    @ColorRes
    public int getTextTitleColor(){
        return textTitleColor;
    }

    public GoodieConfig setTextTitleColor(@ColorRes int textTitleColor){
        this.textTitleColor = textTitleColor;
        return this;
    }
}
