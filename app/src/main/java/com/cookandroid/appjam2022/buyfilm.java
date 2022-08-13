package com.cookandroid.appjam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class buyfilm extends AppCompatActivity {
    ImageButton logo, Imbtn1, Imbtn2, Imbtn3, Imbtn4, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyfilm);
        logo = findViewById(R.id.logo);
        Imbtn1 = findViewById(R.id.Imbtn1);
        Imbtn2 = findViewById(R.id.Imbtn2);
        Imbtn3 = findViewById(R.id.Imbtn3);
        Imbtn4 = findViewById(R.id.Imbtn4);
        profile = findViewById(R.id.profile);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Imbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Imbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), buyfilm.class);
                startActivity(int1);
            }
        });
        Imbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), rentCamera.class);
                startActivity(int1);
            }
        });
        Imbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), processfilm.class);
                startActivity(int1);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), login.class);
                startActivity(int1);
            }
        });
    }
}