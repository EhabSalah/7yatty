package com.smartfuture.hyatty.di.component;


import com.smartfuture.hyatty.di.PerActivity;
import com.smartfuture.hyatty.di.module.ActivityModule;
import com.smartfuture.hyatty.ui.dialog_example.MyDialog;
import com.smartfuture.hyatty.ui.fragment_example.MainFragment;
import com.smartfuture.hyatty.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    // inject into  (Activities, fragments & dialogs)

    void inject(MainFragment mainActivity);

    void inject(MainActivity mainActivity);

    void inject(MyDialog myDialog);
}
