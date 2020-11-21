package com.example.wallpapersandbackgroundclone.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.wallpapersandbackgroundclone.Activities.MainActivity;
import com.example.wallpapersandbackgroundclone.R;

public class SplashScreenActivity extends AppCompatActivity {
    private final int SPLASH_TIME_OUT = 1000;
    private TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreenActivity.this,SplashScreenActivity1.class);
                startActivity(intent);
            }
        });
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent welcomeIntent = new Intent(SplashScreenActivity.this, SplashScreenActivity1.class);
                startActivity(welcomeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}