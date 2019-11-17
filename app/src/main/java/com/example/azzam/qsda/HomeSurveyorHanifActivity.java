package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.azzam.qsda.fragments.HistoryFragmentSurveyorHanif;
import com.example.azzam.qsda.fragments.HomeFragmentSurveyorHanif;
import com.example.azzam.qsda.fragments.NotifFragmentSurveyorHanif;
import com.example.azzam.qsda.fragments.ProfileFragmentSurveyorHanif;

/**
 * Created by azzam on 6/19/2019.
 */

public class HomeSurveyorHanifActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_surveyor);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        android.support.v4.app.Fragment selectedFragment = null;
        selectedFragment = new HomeFragmentSurveyorHanif();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.item_home:
                            selectedFragment = new HomeFragmentSurveyorHanif();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_history:
                            selectedFragment = new HistoryFragmentSurveyorHanif();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_notif:
                            selectedFragment = new NotifFragmentSurveyorHanif();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_account:
                            selectedFragment = new ProfileFragmentSurveyorHanif();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };

    public void DescriptionSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionSurveySurveyor1Hanif.class);
        startActivity(intent);
    }

    public void requestSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityRequestSurvey.class);
        startActivity(intent);
    }

    public void receivePayment(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityReceivePayment.class);
        startActivity(intent);
    }

    public void baliLogin(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void DescriptionSurvey2(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionSurveySurveyor2Hanif.class);
        startActivity(intent);
    }

    public void DescriptionSurvey3(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionSurveySurveyor3Hanif.class);
        startActivity(intent);
    }

    public void DetailSurvey1(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionHistorySurveyorHanif1.class);
        startActivity(intent);
    }

    public void DetailSurvey2(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionHistorySurveyorHanif2.class);
        startActivity(intent);
    }

    public void DetailSurvey3(View view) {
        Intent intent = new Intent(HomeSurveyorHanifActivity.this, ActivityDescriptionHistorySurveyorHanif3.class);
        startActivity(intent);
    }
}
