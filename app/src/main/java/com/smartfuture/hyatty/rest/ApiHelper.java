package com.smartfuture.hyatty.rest;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiHelper {
    @GET
    Single<Boolean> getData();
}
