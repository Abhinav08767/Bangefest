package com.example.krishu.mahtstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home2Activity extends AppCompatActivity {
    private TextView tvN2, tvN3;
    private TextView t1, t2, t3, t4, t5, t6, t7, t8, t9;
    private EditText ev1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        tvN2 = (TextView)findViewById(R.id.tv_Navigation2);
        tvN3 = (TextView)findViewById(R.id.tv_Navigation3);
        tvN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(Home2Activity.this, LoginActivity.class);
                finish();
                startActivity(mainintent);
            }
        });

        tvN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainintent = new Intent(Home2Activity.this, SigninActivity.class);
                finish();
                startActivity(mainintent);
            }
        });

        if (ev1.isSelected())
        {
            ev1.setText("Hello");
        }
    }
}
