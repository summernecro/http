package com.summer.demo;

//by summer on 2018-04-16.

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

import com.summer.demo.databinding.LayoutBinding;

public class MainAct extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.layout,null);
        LayoutBinding layoutBinding = DataBindingUtil.bind(view);
        setContentView(layoutBinding.getRoot());
    }
}
