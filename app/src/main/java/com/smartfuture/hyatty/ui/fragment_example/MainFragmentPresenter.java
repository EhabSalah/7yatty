package com.smartfuture.hyatty.ui.fragment_example;

import com.smartfuture.hyatty.di.PerActivity;
import com.smartfuture.hyatty.ui.base.BasePresenter;

@PerActivity
public interface MainFragmentPresenter<T extends MainFragmentView> extends BasePresenter<T> {

}
