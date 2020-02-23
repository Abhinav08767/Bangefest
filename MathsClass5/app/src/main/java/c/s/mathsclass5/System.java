package c.s.mathsclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class System extends AppCompatActivity {
    private Button cheat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        Button cheat = (Button) findViewById(R.id.butn1);
        cheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent z = new Intent(System.this, MainActivity.class);
                startActivity(z);
                Toast.makeText(System.this, "Made by Abhinav Kumar" +
                        "                                                       St'Xavier's School" +
                        "                                                       Class 5 A" +
                        "                                                       Year 2018-19", Toast.LENGTH_SHORT).show();
            }
        });
    }
};


