package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.azzam.qsda.fragments.HistoryFragmentAdmin;
import com.example.azzam.qsda.fragments.HomeFragmentAdmin;
import com.example.azzam.qsda.fragments.NotifFragmentAdmin;
import com.example.azzam.qsda.fragments.ProfileFragmentAdmin;

/**
 * Created by azzam on 6/19/2019.
 */

public class HomeAdminActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        android.support.v4.app.Fragment selectedFragment = null;
        selectedFragment = new HomeFragmentAdmin();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();


    }



    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.item_home:
                            selectedFragment = new HomeFragmentAdmin();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_history:
                            selectedFragment = new HistoryFragmentAdmin();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_notif:
                            selectedFragment = new NotifFragmentAdmin();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                        case R.id.item_account:
                            selectedFragment = new ProfileFragmentAdmin();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };

    public void newSurvey(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityNewSurvey.class);
        startActivity(intent);
    }

    public void DescriptionSurvey(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDescriptionSurveyOngoning.class);
        startActivity(intent);
    }

    public void DescriptionSurvey1(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDescriptionSurvey1.class);
        startActivity(intent);
    }

    public void DescriptionSurvey2(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDescriptionSurvey2.class);
        startActivity(intent);
    }

    public void DescriptionSurvey3(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDescriptionSurvey3.class);
        startActivity(intent);
    }

    public void baliLogin(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void DetailSurvey(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDetailHistory1.class);
        startActivity(intent);
    }

    public void DetailSurvey2(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDetailHistory2.class);
        startActivity(intent);
    }

    public void DetailSurvey3(View view) {
        Intent intent = new Intent(HomeAdminActivity.this, ActivityDetailHistory3.class);
        startActivity(intent);
    }
}
