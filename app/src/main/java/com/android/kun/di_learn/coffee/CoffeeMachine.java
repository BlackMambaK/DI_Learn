package com.android.kun.di_learn.coffee;

import javax.inject.Inject;

/**
 * Created by jiangkun on 2017/9/28.
 */

public class CoffeeMachine {
    CoffeeMaker mMaker;

    @Inject
    public CoffeeMachine(CoffeeMaker maker) {
        mMaker = maker;
    }

    public String makeCoffee() {
        return mMaker.makeCoffee();
    }
}
