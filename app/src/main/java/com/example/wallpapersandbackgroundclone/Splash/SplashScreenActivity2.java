package com.example.wallpapersandbackgroundclone.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.wallpapersandbackgroundclone.Activities.MainActivity;
import com.example.wallpapersandbackgroundclone.R;

public class SplashScreenActivity2 extends AppCompatActivity {
    private final int SPLASH_TIME_OUT = 2000;
    private TextView skip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);
        skip2 = findViewById(R.id.skip2);
        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreenActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent welcomeIntent = new Intent(SplashScreenActivity2.this, MainActivity.class);
                startActivity(welcomeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}