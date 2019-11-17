package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDescriptionSurveySurveyor1Budi extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_survey_surveyor_1);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDescriptionSurveySurveyor1Budi.this,HomeSurveyorBudiActivity.class));
        finish();
    }

    public void isiSurvey(View view) {
        Intent intent = new Intent(ActivityDescriptionSurveySurveyor1Budi.this, ActivityMengisiSurvey1Hanif.class);
        startActivity(intent);
    }
}
