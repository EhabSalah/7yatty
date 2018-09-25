package com.smartfuture.hyatty.ui.fragment_example;

import com.smartfuture.hyatty.data.DataManager;
import com.smartfuture.hyatty.ui.base.BasePresenterIMP;
import com.smartfuture.hyatty.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class MainFragmentPresenterIMP<T extends MainFragmentView> extends BasePresenterIMP<T> implements MainFragmentPresenter<T> {
    @Inject
    public MainFragmentPresenterIMP(DataManager mDataManager, SchedulerProvider mSchedulerProvider, CompositeDisposable mCompositeDisposable) {
        super(mDataManager, mSchedulerProvider, mCompositeDisposable);
    }
}
