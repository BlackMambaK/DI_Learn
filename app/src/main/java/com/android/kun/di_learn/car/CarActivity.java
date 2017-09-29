package com.android.kun.di_learn.car;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.kun.di_learn.R;
import com.android.kun.di_learn.car.di.Car;
import com.android.kun.di_learn.car.di.component.CarComponent;
import com.android.kun.di_learn.car.di.component.DaggerCarComponent;
import com.android.kun.di_learn.car.di.module.TextViewModule;

import javax.inject.Inject;

/**
 * Created by jiangkun on 2017/9/29.
 */

public class CarActivity extends Activity {

    @Inject
    Car mCar;
    @Inject
    TextView mTextView;

    private CarComponent mCarComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        mCarComponent = DaggerCarComponent.builder().textViewModule(new TextViewModule(this)).build();
        mCarComponent.inject(this);

        ViewGroup root = findViewById(android.R.id.content);
        root.addView(mTextView);
        mTextView.setText("added TextView");
        TextView text = findViewById(R.id.text);
        text.setText(mCar.run());

    }
}
