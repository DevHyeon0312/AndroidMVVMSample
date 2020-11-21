package com.devhyeon.mvvmSample.Main;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

import com.devhyeon.mvvmSample.Base.BaseActivity;
import com.devhyeon.mvvmSample.R;
import com.devhyeon.mvvmSample.databinding.ActivityMainBinding;

/**
 * Created By DevHyeon on 2020.11.21
 * DevHyeon Blog : https://www.devhyeon.com
 * DevHyeon Git  : https://github.com/DevHyeon0312
 * CalcMain Activity
 * */
public class MainActivity extends BaseActivity<ActivityMainBinding> {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBindingView(getView(R.layout.activity_main));
    }

    @Override
    protected void setBindingView(@NonNull View view) {
        setContentsView(view, ActivityMainBinding.bind(view));
    }
}
