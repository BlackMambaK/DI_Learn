package com.android.kun.di_learn.car.di.module;

import com.android.kun.di_learn.car.di.Car;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiangkun on 2017/9/29.
 */
@Module
public class CarModule {

    @Provides
    public Car provide(){
        return new Car();
    }
}
