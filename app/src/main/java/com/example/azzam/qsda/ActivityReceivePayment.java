package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityReceivePayment extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_receive_payment);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityReceivePayment.this,HomeSurveyorHanifActivity.class));
        finish();
    }

    public void checkSurvey(View view) {
        Intent intent = new Intent(ActivityReceivePayment.this, ActivityCheckSurvey.class);
        startActivity(intent);
    }
}
