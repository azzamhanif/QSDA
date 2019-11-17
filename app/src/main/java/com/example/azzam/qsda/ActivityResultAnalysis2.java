package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityResultAnalysis2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_analysis2);
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityResultAnalysis2.this,ActivityDescriptionSurvey2.class));
        finish();
    }
}
