package com.example.krishu.mahtstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView tvN1, tvN2, tvN3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
        tvN1 = (TextView) findViewById(R.id.tv_Navigation1);
        tvN3 = (TextView)findViewById(R.id.tv_Navigation3);
        tvN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(LoginActivity.this, Home2Activity.class);
                finish();
                startActivity(mainintent);
            }
        });

        tvN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(LoginActivity.this, SigninActivity.class);
                finish();
                startActivity(mainintent);
            }
        });
}
}