package com.smartfuture.hyatty.ui.main;

import android.util.Log;

import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.di.PerActivity;
import com.smartfuture.hyatty.ui.base.BasePresenterIMP;
import com.smartfuture.hyatty.utils.rx.SchedulerProvider;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

@PerActivity
public class MainPresenterIMP<V extends MainView> extends BasePresenterIMP<V> implements MainPresenter<V> {
    private static final String TAG = "MainPresenterIMP";
    /**
     * Here i get:
     * getDataManager(); // model
     * getCompositeDisposable();
     * getBaseView(); // view
     * getSchedulerProvider();
     */
    @Inject
    public MainPresenterIMP(DataManager mDataManager, SchedulerProvider mSchedulerProvider, CompositeDisposable mCompositeDisposable) {
        super(mDataManager, mSchedulerProvider, mCompositeDisposable);
    }


    /** Example for doing a server request
     * getBaseView().showLoading();
     getCompositeDisposable().add(getDataManager().doServerRequest() // d el interaction method
     .subscribeOn(getSchedulerProvider().io())
     .observeOn(getSchedulerProvider().ui())
     .subscribe(new Consumer<Boolean>() {
    @Override
    public void accept(Boolean aBoolean) throws Exception { // on response
    getBaseView().showMessage("Success");
    getBaseView().hideLoading();
    }
    }, new Consumer<Throwable>() {
    @Override
    public void accept(Throwable throwable) throws Exception { // on failure
    if (!isViewAttached()) {
    return;
    }

    getBaseView().hideLoading();

    handleApiError(throwable);
    }
    }));*/

    @Override
    public void onViewsReady() {
        getBaseView().showMessage("MVP WORKING CORRECTLY");
    }


}
