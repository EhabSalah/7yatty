package com.smartfuture.hyatty.ui.dialog_example;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartfuture.hyatty.R;
import com.smartfuture.hyatty.di.component.ActivityComponent;
import com.smartfuture.hyatty.ui.base.BaseDialog;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MyDialog extends BaseDialog implements MyDialogView{
    private static final String TAG = "MyDialog";

    @Inject
    MyDialogPresenter<MyDialogView> mPresenter;

    public static MyDialog newInstance() {
        MyDialog fragment = new MyDialog();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_example_layout, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {

            component.inject(this);

            setUnBinder(ButterKnife.bind(this, view));

            mPresenter.onAttach(this);
        }

        return view;
    }

    public void show(FragmentManager fragmentManager) {
        super.show(fragmentManager, TAG);
    }
    @Override
    protected void setUp(View view) {
        // init views
    }

    @Override
    public void dismissDialog() {
        super.dismissDialog(TAG);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }
}
