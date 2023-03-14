package com.example.antic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        fullscreen();

        Button button = (Button) findViewById(R.id.admin_btn);
        Button button1 = (Button) findViewById(R.id.user_btn);
        Button button2 = (Button) findViewById(R.id.btn_login);
        ImageView imageView = findViewById(R.id.log_image);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        imageView.startAnimation(alphaAnimation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adminClick();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userClick();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountLogin();
            }
        });


    }

    private void accountLogin() {
        Intent intent = new Intent(this, LoginAccount.class);
        startActivity(intent);
    }

    public void adminClick(){
        Intent intent = new Intent(this, Admin_signup.class);
        startActivity(intent);
    }

    public void userClick(){
        Intent intent2 = new Intent(this, User_SignUp.class);
        startActivity(intent2);
    }
    private void fullscreen() {

        //todo -> this is full screen
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}