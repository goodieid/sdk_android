package com.goodie.library.ui.activities;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import com.goodie.library.R;
import com.goodie.library.ui.fragments.HomeFragment;
import com.goodie.library.ui.fragments.VoucherFragment;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import butterknife.BindView;

/**
 * Created by asep.surahman on 17/01/2019.
 */

public class HomeActivity extends BaseActivity {


    /*@BindView(R.id.toolbar)
    Toolbar toolbar;*/
    /*@BindView(R.id.title)
    TextView title;*/
    @BindView(R.id.bnve)
    BottomNavigationViewEx navigation;

    public static void startActivity(BaseActivity sourceActivity){
        Intent intent = new Intent(sourceActivity, HomeActivity.class);
        sourceActivity.startActivity(intent);
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setupToolbar();
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.enableAnimation(false);
        navigation.enableItemShiftingMode(false);
        navigation.enableShiftingMode(false);
        navigation.setTextVisibility(true);
        navigation.setCurrentItem(0);
    }

    /*public void setupToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);
        title.setText("Masuk");
    }*/


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.Fragment fragment;
            switch (item.getItemId()) {
                case R.id.nav_home:
                        fragment = new HomeFragment();
                        loadFragment(fragment);
                        return true;
                case R.id.nav_voucherku:
                    fragment = new VoucherFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.nav_reward:
                    return true;

            }
            return false;
        }
    };


    private void loadFragment(android.support.v4.app.Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }



}
