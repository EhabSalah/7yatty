/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.smartfuture.hyatty.utils;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.smartfuture.hyatty.R;

/**
 * Created by amitshekhar on 08/01/17.
 */

public final class AppConstants {


    public static final String PREF_NAME = "_preferences";
    public static final String TIMESTAMP_FORMAT = "dd/MM/yyy";
    public static final int LOADING_BOUNCE_COLOR = Color.WHITE;
    public static final String API_BASE_URL = "https://www.xyz.com";

    private AppConstants() {
    }

}
