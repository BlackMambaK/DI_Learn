package com.android.kun.di_learn.car.di.module;

import android.content.Context;
import android.widget.TextView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiangkun on 2017/9/29.
 */
@Module
public class TextViewModule {
    private Context mContext;

    public TextViewModule(Context context) {
        mContext = context;
    }

    @Provides
    public TextView provideTextView() {
        return new TextView(mContext);
    }
}
