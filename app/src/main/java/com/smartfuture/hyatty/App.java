package com.smartfuture.hyatty;

import android.app.Application;

import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.di.component.ApplicationComponent;
import com.smartfuture.hyatty.di.component.DaggerApplicationComponent;
import com.smartfuture.hyatty.di.module.ApplicationModule;
import com.smartfuture.hyatty.di.module.NetworkModule;
import com.smartfuture.hyatty.utils.AppConstants;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {
    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(AppConstants.API_BASE_URL))
                .build();

        mApplicationComponent.inject(this);

        CalligraphyConfig.initDefault(mCalligraphyConfig); // init app font

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
