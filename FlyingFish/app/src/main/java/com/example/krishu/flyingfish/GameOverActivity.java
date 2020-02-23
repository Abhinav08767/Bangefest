package com.example.krishu.flyingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {


    private Button StartGameAgain;
    private TextView DisplayScore;
    private String score;
    private Button Information;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

    score = getIntent().getExtras().get("SCORE").toString();

        StartGameAgain = (Button)findViewById(R.id.play_Again_btn);

        DisplayScore = (TextView)findViewById(R.id.displayScore);

        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        DisplayScore.setText("Score = " +  score);

        Information = (Button)findViewById(R.id.btnInformation);
        Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents = new Intent(GameOverActivity.this, InfActivity.class);
                startActivity(intents);
            }
        });
    }
}
