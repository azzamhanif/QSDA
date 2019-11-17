package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityNewSurvey extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_surveyor);

        Spinner sp = findViewById(R.id.spinnerSize);
        final EditText et = findViewById(R.id.numberValue);
        final EditText et2 = findViewById(R.id.sizeSample);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        et2.setText("");
                        et2.setFocusable(false);
                        et.setText("");
                        et.setFocusable(false);
                        break;
                    case 1:
                        et2.setText("Auto");
                        et2.setTextColor(R.color.abuabu);
                        et2.setFocusable(false);
                        et.setText("");
                        et.setFocusableInTouchMode(true);
                        break;
                    case 2:
                        et.setText("");
                        et.setFocusableInTouchMode(true);
                        et2.setText("");
                        et2.setFocusableInTouchMode(true);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void backHome(View view) {
        startActivity(new Intent(ActivityNewSurvey.this,HomeAdminActivity.class));
        finish();
    }

    public void NextPage(View view) {
        startActivity(new Intent(ActivityNewSurvey.this,ActivityNewSurveyDua.class));
    }
}
