package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDescriptionSurveyOngoning extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_survey_ongoing);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDescriptionSurveyOngoning.this,HomeAdminActivity.class));
        finish();
    }


    public void SurveyPlacement(View view) {
        startActivity(new Intent(ActivityDescriptionSurveyOngoning.this,ActivityNewSurveyEmpat.class));
    }

    public void Analysis(View view) {
        startActivity(new Intent(ActivityDescriptionSurveyOngoning.this,ActivityResultAnalysis1.class));
    }
}
