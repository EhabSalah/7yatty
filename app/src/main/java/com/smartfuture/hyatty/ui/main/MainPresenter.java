package com.smartfuture.hyatty.ui.main;

import com.smartfuture.hyatty.ui.base.BasePresenter;

public interface MainPresenter<V extends MainView> extends BasePresenter<V> {
    void onViewsReady();
}
