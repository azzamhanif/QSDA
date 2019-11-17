package com.example.azzam.qsda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by azzam on 6/30/2019.
 */

public class ActivityNewSurveyDua extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_surveyor_dua);

        createExampleList();
        buildRecyclerView();
    }

    public void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem());
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new AdapterRecycleView(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void backPrevious(View view) {
        startActivity(new Intent(ActivityNewSurveyDua.this,ActivityNewSurvey.class));
        finish();
    }

    public void NextPage(View view) {
        startActivity(new Intent(ActivityNewSurveyDua.this,ActivityNewSurveyTiga.class));
    }

    public void tambahVariable(View view) {
        mExampleList.add(new ExampleItem());
        mAdapter.notifyItemInserted(mExampleList.size());
    }
}
