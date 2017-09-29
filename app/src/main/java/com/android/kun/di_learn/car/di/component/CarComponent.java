package com.android.kun.di_learn.car.di.component;

import com.android.kun.di_learn.car.CarActivity;
import com.android.kun.di_learn.car.di.module.CarModule;
import com.android.kun.di_learn.car.di.module.TextViewModule;

import dagger.Component;

/**
 * Created by jiangkun on 2017/9/29.
 */

@Component(modules = {CarModule.class, TextViewModule.class})
public interface CarComponent {
    void inject(CarActivity activity);
}
