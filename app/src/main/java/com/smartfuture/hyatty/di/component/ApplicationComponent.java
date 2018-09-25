package com.smartfuture.hyatty.di.component;

import android.app.Application;
import android.content.Context;

import com.smartfuture.hyatty.App;
import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.di.ApplicationContext;
import com.smartfuture.hyatty.di.module.ApplicationModule;
import com.smartfuture.hyatty.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    // inject into
    void inject(App app);

    // exposing these instances to dependent components
    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}