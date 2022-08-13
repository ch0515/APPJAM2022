package com.cookandroid.appjam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class buyfilm extends AppCompatActivity {
    ImageButton logo, Imbtn1, Imbtn2, Imbtn3, Imbtn4, profile, img1, img2, img3, img4;
    TextView product1, product2, product3, product4;
    TextView price1, price2, price3, price4;
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
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        product1 = findViewById(R.id.product1);
        product2 = findViewById(R.id.product2);
        product3 = findViewById(R.id.product3);
        product4 = findViewById(R.id.product4);
        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);
        price3 = findViewById(R.id.price3);
        price4 = findViewById(R.id.price4);
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
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro1.class);
                startActivity(int1);
            }
        });
        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro1.class);
                startActivity(int1);
            }
        });
        price1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro1.class);
                startActivity(int1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro2.class);
                startActivity(int1);
            }
        });
        product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro2.class);
                startActivity(int1);
            }
        });
        price2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro2.class);
                startActivity(int1);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro3.class);
                startActivity(int1);
            }
        });
        product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro3.class);
                startActivity(int1);
            }
        });
        price3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro3.class);
                startActivity(int1);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro4.class);
                startActivity(int1);
            }
        });
        product4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro4.class);
                startActivity(int1);
            }
        });
        price4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), fpro4.class);
                startActivity(int1);
            }
        });
    }
}