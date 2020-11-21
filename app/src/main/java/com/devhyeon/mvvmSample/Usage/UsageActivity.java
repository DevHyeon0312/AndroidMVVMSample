package com.devhyeon.mvvmSample.Usage;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

import com.devhyeon.mvvmSample.Base.BaseActivity;
import com.devhyeon.mvvmSample.R;
import com.devhyeon.mvvmSample.databinding.ActivityUsageBinding;

/**
 * Created By DevHyeon on 2020.11.21
 * DevHyeon Blog : https://www.devhyeon.com
 * DevHyeon Git  : https://github.com/DevHyeon0312
 * CalcUsage View
 * */
public class UsageActivity extends BaseActivity<ActivityUsageBinding> {
    private final String TAG = UsageActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBindingView(getView(R.layout.activity_usage));
    }

    @Override
    protected void setBindingView(@NonNull View view) {
        setContentsView(view, ActivityUsageBinding.bind(view));
    }

}