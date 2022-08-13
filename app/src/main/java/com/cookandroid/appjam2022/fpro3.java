package com.cookandroid.appjam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class fpro3 extends AppCompatActivity {
    ImageButton logo,profile;
    TextView price, Quantity;
    Button minus, add;
    private int count;
    private int pri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpro3);
        setContentView(R.layout.activity_fpro2);
        logo = findViewById(R.id.logo);
        profile = findViewById(R.id.profile);
        price = findViewById(R.id.price);
        Quantity = findViewById(R.id.Quantity);
        minus = findViewById(R.id.minus);
        Quantity = findViewById(R.id.Quantity);
        add = findViewById(R.id.add);
        Quantity.setText(count+"");
        price.setText(pri+"");
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), MainActivity.class);
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