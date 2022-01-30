package com.example.buckleup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configureRewardsButton();
        configureExploreButton();
        configureDriveButton();

    }

    public void configureExploreButton(){
        Button Explore = (Button)findViewById(R.id.ExploreButton);
        Explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ExplorePage.class));
            }
        });
    }

    public void configureRewardsButton(){
        Button Rewards = (Button)findViewById(R.id.RewardsButton);
        Rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RewardsPage.class));
            }
        });
    }

    public void configureDriveButton(){
        Button Drive = (Button)findViewById(R.id.DrivingButton);
        Drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DrivingPage.class));
            }
        });
    }
}