package com.example.krishu.mahtstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {
    private TextView tvN1, tvN2, tvN3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        tvN1 = (TextView) findViewById(R.id.tv_Navigation1);
        tvN2 = (TextView)findViewById(R.id.tv_Navigation2);
        tvN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(SigninActivity.this, Home2Activity.class);
                finish();
                startActivity(mainintent);
            }
        });

        tvN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(SigninActivity.this, LoginActivity.class);
                finish();
                startActivity(mainintent);
            }
        });
    }
}