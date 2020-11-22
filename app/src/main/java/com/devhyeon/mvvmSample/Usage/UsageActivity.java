package com.devhyeon.mvvmSample.Usage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.devhyeon.mvvmSample.Base.BaseActivity;
import com.devhyeon.mvvmSample.Calculator.CalcModel;
import com.devhyeon.mvvmSample.Calculator.CalcViewModel;
import com.devhyeon.mvvmSample.Main.MainView;
import com.devhyeon.mvvmSample.Main.MainViewModel;
import com.devhyeon.mvvmSample.R;
import com.devhyeon.mvvmSample.databinding.ActivityUsageBinding;

import java.util.ArrayList;

/**
 * Created By DevHyeon on 2020.11.21
 * DevHyeon Blog : https://www.devhyeon.com
 * DevHyeon Git  : https://github.com/DevHyeon0312
 * CalcUsage View
 * */
public class UsageActivity extends BaseActivity<ActivityUsageBinding> implements UsageView {
    private final String TAG = UsageActivity.class.getSimpleName();

    private CalcViewModel calcViewModel;

    private UsageAdapter usageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBindingView(getView(R.layout.activity_usage));

        setCalcViewModel();
        setAdapter();
    }

    @Override
    protected void setBindingView(@NonNull View view) {
        setContentsView(view, ActivityUsageBinding.bind(view));
    }

    @Override
    public void setCalcViewModel() {
        calcViewModel = new ViewModelProvider(this).get(CalcViewModel.class);
        calcViewModel.setModel(mActivity);
        calcViewModel.getCalcModel().observe(this, calcModel -> {
            updateAdapter(calcModel.getCalcResultList().getResultUsage());
        });
    }

    @Override
    public void setAdapter() {
        usageAdapter = new UsageAdapter();
        xml.rvUsage.setLayoutManager(new LinearLayoutManager(this));
        xml.rvUsage.setAdapter(usageAdapter);
    }

    @Override
    public void updateAdapter(ArrayList<CalcModel.CalcResult> list) {
        usageAdapter.addItem(list);
        usageAdapter.notifyDataSetChanged();
    }
}