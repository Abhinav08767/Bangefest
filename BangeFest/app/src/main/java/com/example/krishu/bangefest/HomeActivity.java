package com.example.krishu.bangefest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Set;

public class HomeActivity extends AppCompatActivity {
    private ImageView imnext1, imnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imnext1 = (ImageView)findViewById(R.id.cart);
        imnext2 = (ImageView)findViewById(R.id.settings);
        imnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CartActivity.class);
            }
        });
        imnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SettingsActivity.class);
            }
        });
    }
    }
