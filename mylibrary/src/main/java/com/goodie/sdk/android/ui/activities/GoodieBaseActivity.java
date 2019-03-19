package com.goodie.sdk.android.ui.activities;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.goodie.sdk.android.Goodie;
import com.goodie.sdk.android.data.config.GoodieConfig;

/**
 * Created by Goodie on 01/02/2019.
 */

public abstract class GoodieBaseActivity extends AppCompatActivity{

    protected GoodieConfig goodieConfig;
    protected abstract int getLayout();
    protected abstract void onLoadView();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        goodieConfig = onLoadConfig();
    }

    protected GoodieConfig onLoadConfig(){
        return Goodie.getConfig();
    }



}
