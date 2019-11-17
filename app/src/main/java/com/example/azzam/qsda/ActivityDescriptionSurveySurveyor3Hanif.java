package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDescriptionSurveySurveyor3Hanif extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_survey_surveyor_3);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDescriptionSurveySurveyor3Hanif.this,HomeSurveyorHanifActivity.class));
        finish();
    }

    public void isiSurvey(View view) {
        Intent intent = new Intent(ActivityDescriptionSurveySurveyor3Hanif.this, ActivityMengisiSurvey3Hanif.class);
        startActivity(intent);
    }
}
