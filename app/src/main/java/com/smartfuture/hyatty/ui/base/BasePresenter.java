package com.smartfuture.hyatty.ui.base;

public interface BasePresenter<V extends BaseView> {

    void onAttach(V view);

    void onDetach();

    void handleApiError(Throwable error);

}
