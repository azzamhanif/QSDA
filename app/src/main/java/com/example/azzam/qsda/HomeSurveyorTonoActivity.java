package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.azzam.qsda.fragments.HistoryFragmentSurveyorTono;
import com.example.azzam.qsda.fragments.HomeFragmentSurveyorTono;
import com.example.azzam.qsda.fragments.NotifFragmentSurveyorTono;
import com.example.azzam.qsda.fragments.ProfileFragmentSurveyorTono;

/**
 * Created by azzam on 6/19/2019.
 */

public class HomeSurveyorTonoActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_surveyor);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        android.support.v4.app.Fragment selectedFragment = null;
        selectedFragment = new HomeFragmentSurveyorTono();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.item_home:
                            selectedFragment = new HomeFragmentSurveyorTono();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_history:
                            selectedFragment = new HistoryFragmentSurveyorTono();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_notif:
                            selectedFragment = new NotifFragmentSurveyorTono();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_account:
                            selectedFragment = new ProfileFragmentSurveyorTono();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };

    public void DescriptionSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityDescriptionSurveySurveyor1Hanif.class);
        startActivity(intent);
    }

    public void DetailSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityDescriptionHistorySurveyorTono.class);
        startActivity(intent);
    }

    public void requestSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityRequestSurvey.class);
        startActivity(intent);
    }

    public void receivePayment(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityReceivePayment.class);
        startActivity(intent);
    }

    public void baliLogin(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void DescriptionSurvey2(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityDescriptionSurveySurveyor2Tono.class);
        startActivity(intent);
    }

    public void DescriptionSurvey3(View view) {
        Intent intent = new Intent(HomeSurveyorTonoActivity.this, ActivityDescriptionSurveySurveyor3Tono.class);
        startActivity(intent);
    }
}
