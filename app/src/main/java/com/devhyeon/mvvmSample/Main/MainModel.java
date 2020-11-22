package com.devhyeon.mvvmSample.Main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By DevHyeon on 2020.11.21
 * DevHyeon Blog : https://www.devhyeon.com
 * DevHyeon Git  : https://github.com/DevHyeon0312
 * CalcMain Model
 * */

@Data @NoArgsConstructor @AllArgsConstructor
class MainModel {
    private String nowTime;    //now time
}
