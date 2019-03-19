package com.goodie.library.ui.activities;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.goodie.library.R;

/**
 * Created by rahman on 9/24/2017.
 */


public class SplashScreenActivity extends BaseActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delayFirstActivity();
    }


    private void delayFirstActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                HomeActivity.startActivity(SplashScreenActivity.this);
            }
        }, 3000);
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_splash_screen;
    }
}
