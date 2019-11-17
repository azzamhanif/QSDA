package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityNewSurveyTiga extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_surveyor_tiga);
    }

    public void backPrevious(View view) {
        startActivity(new Intent(ActivityNewSurveyTiga.this,ActivityNewSurveyDua.class));
        finish();
    }

    public void NextPage(View view) {
        startActivity(new Intent(ActivityNewSurveyTiga.this,ActivityNewSurveyEmpat.class));
    }
}
