package com.example.lysy.firstapp.logo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lysy.firstapp.LoginActivity;
import com.example.lysy.firstapp.R;

public class LogoApplication extends SplashscreanActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLogo(R.mipmap.kot);
    }

    @Override
    void startActivity() {
        Intent intent = new Intent(LogoApplication.this, LoginActivity.class);
        startActivity(intent);
    }
}
