package com.smartfuture.hyatty.ui.dialog_example;

import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.ui.base.BasePresenter;
import com.smartfuture.hyatty.ui.base.BasePresenterIMP;
import com.smartfuture.hyatty.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class MyDialogPresenterIMP<V extends MyDialogView> extends BasePresenterIMP<V> implements MyDialogPresenter<V> {
    @Inject
    public MyDialogPresenterIMP(DataManager mDataManager, SchedulerProvider mSchedulerProvider, CompositeDisposable mCompositeDisposable) {
        super(mDataManager, mSchedulerProvider, mCompositeDisposable);
    }
}
