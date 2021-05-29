package com.fulminatix.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    // Splash
    private static int SPLASH_TIME_OUT = 4000;

    // Animations
    Animation topAnimation, bottomAnimation, middleAnimation;

    // Hooks
    View firstLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine;
    TextView txtAppName, txtSlogan;
    ImageView fxLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        // Loading animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);

        // Loading hooks
        firstLine = (View)findViewById(R.id.first_line);
        secondLine = (View)findViewById(R.id.second_line);
        thirdLine = (View)findViewById(R.id.third_line);
        fourthLine = (View)findViewById(R.id.fourth_line);
        fifthLine = (View)findViewById(R.id.fifth_line);
        sixthLine = (View)findViewById(R.id.sixth_line);

        txtAppName = (TextView)findViewById(R.id.txt_app_name);
        txtSlogan = (TextView)findViewById(R.id.txt_slogan);

        fxLogo = (ImageView)findViewById(R.id.fx_logo);

        // Setting animations
        firstLine.setAnimation(topAnimation);
        secondLine.setAnimation(topAnimation);
        thirdLine.setAnimation(topAnimation);
        fourthLine.setAnimation(topAnimation);
        fifthLine.setAnimation(topAnimation);
        sixthLine.setAnimation(topAnimation);

        txtAppName.setAnimation(middleAnimation);
        fxLogo.setAnimation(middleAnimation);

        txtSlogan.setAnimation(bottomAnimation);

        // Splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}