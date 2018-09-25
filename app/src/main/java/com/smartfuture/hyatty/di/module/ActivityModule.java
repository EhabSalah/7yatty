package com.smartfuture.hyatty.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.smartfuture.hyatty.di.ActivityContext;
import com.smartfuture.hyatty.di.PerActivity;
import com.smartfuture.hyatty.ui.dialog_example.MyDialogPresenter;
import com.smartfuture.hyatty.ui.dialog_example.MyDialogPresenterIMP;
import com.smartfuture.hyatty.ui.dialog_example.MyDialogView;
import com.smartfuture.hyatty.ui.fragment_example.MainFragmentPresenter;
import com.smartfuture.hyatty.ui.fragment_example.MainFragmentPresenterIMP;
import com.smartfuture.hyatty.ui.fragment_example.MainFragmentView;
import com.smartfuture.hyatty.ui.main.MainPresenter;
import com.smartfuture.hyatty.ui.main.MainPresenterIMP;
import com.smartfuture.hyatty.ui.main.MainView;
import com.smartfuture.hyatty.utils.rx.AppSchedulerProvider;
import com.smartfuture.hyatty.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule { // providing (Adapters, Presenters, LayoutManagers, Disposables)
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    MainPresenter<MainView> provideMainPresenter(
            MainPresenterIMP<MainView> presenter) {
        return presenter;
    }

    @Provides
    MainFragmentPresenter<MainFragmentView> provideAboutPresenter(
            MainFragmentPresenterIMP<MainFragmentView> presenter) {
        return presenter;
    }

    @Provides
    MyDialogPresenter<MyDialogView> provideMyDialogPresenter(
            MyDialogPresenterIMP<MyDialogView> presenter) {
        return presenter;
    }
}
