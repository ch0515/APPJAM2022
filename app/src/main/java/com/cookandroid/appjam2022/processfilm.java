package com.cookandroid.appjam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class processfilm extends AppCompatActivity {
    ImageButton logo, Imbtn1, Imbtn2, Imbtn3, Imbtn4, profile;
    TextView price, Quantity;
    Button minus, add, keep, Buy;
    private int count;
    private int pri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processfilm);
        logo = (ImageButton) findViewById(R.id.logo);
        Imbtn1 = findViewById(R.id.Imbtn1);
        Imbtn2 = findViewById(R.id.Imbtn2);
        Imbtn3 = findViewById(R.id.Imbtn3);
        Imbtn4 = findViewById(R.id.Imbtn4);
        profile = findViewById(R.id.profile);
        price = findViewById(R.id.price);
        Quantity = findViewById(R.id.Quantity);
        minus = findViewById(R.id.minus);
        Quantity = findViewById(R.id.Quantity);
        add = findViewById(R.id.add);
        keep = findViewById(R.id.keep);
        Buy = findViewById(R.id.buy);
        Quantity.setText(count+"");
        price.setText(pri+"");
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(int2);
            }
        });
        Imbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(int1);
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
        keep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), scanfilm.class);
                startActivity(int1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                pri = pri + 11000;
                Quantity.setText(count+"");
                price.setText(pri+"won");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count>0 && pri>0){
                    count--;
                    pri = pri - 11000;
                    Quantity.setText(count+"");
                    price.setText(pri+"won");
                }else{
                    Toast.makeText(getApplicationContext(),"가격과 수량이 0보다 작습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}