package com.goodie.library.ui.activities;

import android.graphics.Color;

import com.afollestad.materialdialogs.MaterialDialog;
import com.goodie.library.R;
import com.goodie.library.data.prefs.PrefHelper;



/**
 * Created by asep.surahman on 16/01/2019.
 */

public class BasePresenter {

    private BaseActivity activity;

    public BasePresenter(BaseActivity activity) {
        this.activity = activity;
    }

    void invalid() {
        activity.dismissProgressDialog();
        new MaterialDialog.Builder(activity)
                .iconRes(R.mipmap.ic_launcher)
                .backgroundColor(activity.cAppsPrimary)
                .title(activity.getString(R.string.logout).toUpperCase())
                .titleColor(Color.WHITE)
                .content(activity.expiredSession)
                .contentColor(Color.WHITE)
                .neutralText(R.string.ok)
                .show();

        PrefHelper.clearAllPreferences();
        LoginActivity.startActivityFromAutoLogout(activity);
        activity.finish();
    }



}
