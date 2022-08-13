package com.cookandroid.appjam2022;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class login extends AppCompatActivity {
    ImageButton logo, profile, Imbtn1, Imbtn2, Imbtn3, Imbtn4;
    Button btnsignout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        logo = findViewById(R.id.logo);
        profile = findViewById(R.id.profile);
        btnsignout = findViewById(R.id.btnsignout);
//        Imbtn1 = findViewById(R.id.btn1);
//        Imbtn2 = findViewById(R.id.btn2);
//        Imbtn3 = findViewById(R.id.btn3);
//        Imbtn4 = findViewById(R.id.btn4);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }
        });
        btnsignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(int1);
            }
        });
    }
}