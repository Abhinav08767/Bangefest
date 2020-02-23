package com.valischat.example.wallpaperpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView myGridView;
    Integer[] myIntegerArray =

            {
                    R.drawable.one, R.drawable.two,
                    R.drawable.three, R.drawable.four,
                    R.drawable.five, R.drawable.six,
                    R.drawable.seven, R.drawable.eight,

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGridView = findViewById(R.id.myGridView);

    }
}
