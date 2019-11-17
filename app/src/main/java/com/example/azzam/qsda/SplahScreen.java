package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by azzam on 6/20/2019.
 */

public class SplahScreen extends AppCompatActivity {
    private int waktu_loading = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplahScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },waktu_loading);
    }
}
