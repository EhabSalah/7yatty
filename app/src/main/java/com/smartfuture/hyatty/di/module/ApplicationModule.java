package com.smartfuture.hyatty.di.module;

import android.app.Application;
import android.content.Context;
import com.smartfuture.hyatty.R;
import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.data.DataManagerIMP;
import com.smartfuture.hyatty.data.prefs.PreferencesHelper;
import com.smartfuture.hyatty.data.prefs.PreferencesHelperIMP;
import com.smartfuture.hyatty.di.ApplicationContext;
import com.smartfuture.hyatty.di.PreferenceInfo;
import com.smartfuture.hyatty.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(DataManagerIMP dataManagerIMP) {
        return dataManagerIMP;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName(@ApplicationContext Context context) {
        return context.getString(R.string.app_name) + AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(PreferencesHelperIMP preferencesHelperIMP) {
        return preferencesHelperIMP;
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/clan-ot/clan_ot_book_font.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}