package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDescriptionSurvey3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_survey_3);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDescriptionSurvey3.this,HomeAdminActivity.class));
        finish();
    }


    public void SurveyPlacement(View view) {
        startActivity(new Intent(ActivityDescriptionSurvey3.this,ActivityNewSurveyEmpat.class));
    }

    public void Analysis(View view) {
        startActivity(new Intent(ActivityDescriptionSurvey3.this,ActivityResultAnalysis3.class));
    }

    public void Surveyy(View view) {
        startActivity(new Intent(ActivityDescriptionSurvey3.this,ActivityDataSurvey3.class));
    }
}
