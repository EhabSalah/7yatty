package com.smartfuture.hyatty.ui.base;

import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenterIMP<V extends BaseView> implements BasePresenter<V> {

    private final DataManager mDataManager;
    private final SchedulerProvider mSchedulerProvider;
    private final CompositeDisposable mCompositeDisposable;

    private V mMvpView;

    @Inject
    public BasePresenterIMP(DataManager mDataManager, SchedulerProvider mSchedulerProvider, CompositeDisposable mCompositeDisposable) {
        this.mDataManager = mDataManager;
        this.mSchedulerProvider = mSchedulerProvider;
        this.mCompositeDisposable = mCompositeDisposable;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mCompositeDisposable.dispose();
        mMvpView = null;
    }

    @Override
    public void handleApiError(Throwable error) {
        // write the logic to  inform error to the user
    }


    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getBaseView() {
        return mMvpView;
    }


    public DataManager getDataManager() {
        return mDataManager;
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

}
