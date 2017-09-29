package com.android.kun.di_learn.coffee.component;

import com.android.kun.di_learn.MainActivity;
import com.android.kun.di_learn.coffee.module.SimpleMakerModule;

import dagger.Component;

/**
 * Created by jiangkun on 2017/9/28.
 */
@Component(modules = SimpleMakerModule.class)
public interface SimpleComponent {
    void inject(MainActivity activity);
}
