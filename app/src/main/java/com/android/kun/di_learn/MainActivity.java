package com.android.kun.di_learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.kun.di_learn.car.CarActivity;
import com.android.kun.di_learn.coffee.SimpleMaker;
import com.android.kun.di_learn.coffee.component.DaggerSimpleComponent;
import com.android.kun.di_learn.coffee.component.SimpleComponent;
import com.android.kun.di_learn.coffee.module.SimpleMakerModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    SimpleMaker mMaker;

    private SimpleComponent mSimpleComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimpleComponent = DaggerSimpleComponent.builder().simpleMakerModule(new SimpleMakerModule("hhh")).build();
        mSimpleComponent.inject(this);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(mMaker.makeCoffee());
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, CarActivity.class);
        startActivity(intent);
    }
}
