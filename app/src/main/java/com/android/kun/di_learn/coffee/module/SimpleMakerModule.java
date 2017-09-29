package com.android.kun.di_learn.coffee.module;

import com.android.kun.di_learn.coffee.Cooker;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiangkun on 2017/9/28.
 */
@Module
public class SimpleMakerModule {

    public SimpleMakerModule(String str) {
    }

    @Provides
    public Cooker provideCooker(){
        return new Cooker();
    }

    @Provides
    public String provideName(){
        return " james ";
    }
}
