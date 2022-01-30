package com.example.buckleup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


import java.util.Objects;

public class RewardsPage extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView textView;
    public int insurancePoints = 54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards_page);

        progressBar = findViewById(R.id.progress);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(1000);
                }
            }
        });

        thread.start();*/


        progressBar.incrementProgressBy(insurancePoints);
        textView = findViewById(R.id.insurance);
        String insuracePercent = Integer.toString(insurancePoints)+"%";
        textView.setText(insuracePercent);
        configureHomeScreenButton();
    }

    public void configureHomeScreenButton(){
        Button HomeScreen = (Button) findViewById(R.id.BackToMainFromRewards);
        HomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}