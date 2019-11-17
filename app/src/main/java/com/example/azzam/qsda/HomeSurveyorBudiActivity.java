package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.azzam.qsda.fragments.HistoryFragmentSurveyorBudi;
import com.example.azzam.qsda.fragments.HomeFragmentSurveyorBudi;
import com.example.azzam.qsda.fragments.NotifFragmentSurveyorBudi;
import com.example.azzam.qsda.fragments.ProfileFragmentSurveyorBudi;

/**
 * Created by azzam on 6/19/2019.
 */

public class HomeSurveyorBudiActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_surveyor);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        android.support.v4.app.Fragment selectedFragment = null;
        selectedFragment = new HomeFragmentSurveyorBudi();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.item_home:
                            selectedFragment = new HomeFragmentSurveyorBudi();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_history:
                            selectedFragment = new HistoryFragmentSurveyorBudi();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_notif:
                            selectedFragment = new NotifFragmentSurveyorBudi();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_account:
                            selectedFragment = new ProfileFragmentSurveyorBudi();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };

    public void DescriptionSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityDescriptionSurveySurveyor1Hanif.class);
        startActivity(intent);
    }

    public void requestSurvey(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityRequestSurvey.class);
        startActivity(intent);
    }

    public void receivePayment(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityReceivePayment.class);
        startActivity(intent);
    }

    public void baliLogin(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void DescriptionSurvey2(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityDescriptionSurveySurveyor2Budi.class);
        startActivity(intent);
    }

    public void DescriptionSurvey3(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityDescriptionSurveySurveyor3Budi.class);
        startActivity(intent);
    }

    public void DetailSurvey3(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityDescriptionHistorySurveyorBudi3.class);
        startActivity(intent);
    }

    public void DetailSurvey2(View view) {
        Intent intent = new Intent(HomeSurveyorBudiActivity.this, ActivityDescriptionHistorySurveyorBudi2.class);
        startActivity(intent);
    }
}
