package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityMengisiSurvey3Hanif extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_survey_3_grade10);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityMengisiSurvey3Hanif.this,ActivityDescriptionSurveySurveyor3Hanif.class));
        finish();
    }

    public void Done(View view) {
        startActivity(new Intent(ActivityMengisiSurvey3Hanif.this,HomeSurveyorHanifActivity.class));
        finish();
    }
}
