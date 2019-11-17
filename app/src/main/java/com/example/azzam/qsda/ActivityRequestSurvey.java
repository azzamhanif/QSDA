package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityRequestSurvey extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_survey);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityRequestSurvey.this,HomeSurveyorHanifActivity.class));
        finish();
    }


    public void SurveyPlacement(View view) {
        startActivity(new Intent(ActivityRequestSurvey.this,ActivityNewSurveyEmpat.class));
    }

    public void Analysis(View view) {
        startActivity(new Intent(ActivityRequestSurvey.this,ActivityResultAnalysis1.class));
    }
}
