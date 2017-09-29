package com.android.kun.di_learn.car.di.module;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiangkun on 2017/9/29.
 */
@Module
public class StringsModule {

    @Provides
    List<String> getStrings() {
        List<String> list = new ArrayList<>();
        list.add("ha ");
        list.add("ha ");
        list.add("ha ");
        return list;
    }
}
