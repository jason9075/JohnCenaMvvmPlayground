package com.jason9075.databindingplayground.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jason9075.databindingplayground.R;
import com.jason9075.databindingplayground.model.User;
import com.jason9075.databindingplayground.databinding.ActivityMainBinding;
import com.jason9075.databindingplayground.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel(this));

    }


}
