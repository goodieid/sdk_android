package com.goodie.library;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.multidex.MultiDex;
import com.goodie.library.data.api.LibraryService;
import com.goodie.library.utils.FontsOverride;
import com.goodie.library.utils.LocaleUtil;
import java.util.Locale;
import timber.log.Timber;

/**
 * Created by Goodie on 29/01/2019.
 */

public class LibraryApplication extends Application {

    private static LibraryApplication instance;
    private LibraryService libraryService;
    private SharedPreferences sharedPreferences;

    public static LibraryApplication getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        LocaleUtil.setLocale(new Locale("ID"));
        LocaleUtil.updateConfig(this, getBaseContext().getResources().getConfiguration());
        instance = this;
        setupTimber();
        setupWebService();
        setupSharedPreferences();
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/HelveticaNeueLts.otf");
    }

    public LibraryService getOlshopService(){
        return libraryService;
    }

    private void setupTimber(){
        if (BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree(){}
            );
        }
    }


    private void setupWebService() {
        libraryService = new LibraryService(this);
    }


    private void setupSharedPreferences(){
        this.sharedPreferences = getSharedPreferences(LibraryApplication.class.getSimpleName(), Context.MODE_PRIVATE);
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        LocaleUtil.updateConfig(this,newConfig);
    }


}
