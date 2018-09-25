package com.smartfuture.hyatty.data;

import android.content.Context;

import com.smartfuture.hyatty.data.prefs.PreferencesHelper;
import com.smartfuture.hyatty.di.ApplicationContext;
import com.smartfuture.hyatty.rest.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class DataManagerIMP implements DataManager {
    private static final String TAG = "DataManagerIMP";

    private final Context mContext;
    private final PreferencesHelper mPreferencesHelper;
    private ApiHelper apiHelper;

    @Inject
    public DataManagerIMP(@ApplicationContext Context context,
                          PreferencesHelper preferencesHelper, ApiHelper apiHelper) {
        mContext = context;
        mPreferencesHelper = preferencesHelper;
        this.apiHelper = apiHelper;
    }

    @Override
    public Single<Boolean> doServerRequest()
    {
        return apiHelper.getData();
    }
}
