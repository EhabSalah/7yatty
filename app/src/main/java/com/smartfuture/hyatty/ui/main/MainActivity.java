package com.smartfuture.hyatty.ui.main;

import android.os.Bundle;

import com.smartfuture.hyatty.R;
import com.smartfuture.hyatty.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter<MainView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();
    }

    @Override
    protected void setUp() {
        // init views
        mPresenter.onViewsReady();
    }


}
