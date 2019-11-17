package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDataSurvey2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_survey_2);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDataSurvey2.this,ActivityDescriptionSurvey2.class));
        finish();
    }

    public void Surveyy (View view) {
        startActivity(new Intent(ActivityDataSurvey2.this,ActivityDataSurvey1.class));
    }

    public void SurveyPlacement(View view) {
        startActivity(new Intent(ActivityDataSurvey2.this,ActivityNewSurveyEmpat.class));
    }

    public void Analysis(View view) {
        startActivity(new Intent(ActivityDataSurvey2.this,ActivityResultAnalysis1.class));
    }


}
