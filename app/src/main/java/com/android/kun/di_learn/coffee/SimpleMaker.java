package com.android.kun.di_learn.coffee;

import javax.inject.Inject;

/**
 * Created by jiangkun on 2017/9/28.
 */

public class SimpleMaker implements CoffeeMaker {
    Cooker mCooker;
    private String name;

    @Inject
    public SimpleMaker(Cooker cooker, String name) {
        mCooker = cooker;
        this.name = name;
    }

    @Override
    public String makeCoffee() {
        return name + "  " + mCooker.make();
    }
}
