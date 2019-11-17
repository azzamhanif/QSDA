package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityDescriptionHistorySurveyorBudi2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_history_survey_budi_2);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityDescriptionHistorySurveyorBudi2.this,HomeSurveyorBudiActivity.class));
        finish();
    }
}
