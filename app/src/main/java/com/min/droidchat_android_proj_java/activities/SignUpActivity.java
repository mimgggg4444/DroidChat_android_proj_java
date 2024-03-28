package com.min.droidchat_android_proj_java.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.min.droidchat_android_proj_java.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {


    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.textSingIn.setOnClickListener(v-> onBackPressed());
    }
}