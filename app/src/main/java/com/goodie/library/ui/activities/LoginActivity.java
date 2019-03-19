package com.goodie.library.ui.activities;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.goodie.library.R;
import butterknife.BindView;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity{


    private static final String AUTO_LOGOUT = "autoLogout";
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title)
    TextView title;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupToolbar();
    }

    public static void startActivityFromAutoLogout(BaseActivity sourceActivity) {
        Intent intent = new Intent(sourceActivity, LoginActivity.class);
        intent.putExtra(AUTO_LOGOUT, true);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        sourceActivity.startActivityForResult(intent, 0);
    }


    public void setupToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);
        title.setText("Masuk");
    }




}

