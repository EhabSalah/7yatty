package com.smartfuture.hyatty.data;

import io.reactivex.Single;

public interface DataManager {

    Single<Boolean> doServerRequest();

}
