package com.valischat.example.landinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {
    private Spinner sa, sb, sc, sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sa = (Spinner)findViewById(R.id.spinnera);
        sb = (Spinner)findViewById(R.id.spinnerb);
        sc = (Spinner)findViewById(R.id.spinnerc);
        sd = (Spinner)findViewById(R.id.spinnerd);

    }
}
