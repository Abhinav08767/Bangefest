package c.s.mathsclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Geometry extends AppCompatActivity {
private Button bye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
        Button bye = (Button)findViewById(R.id.button7);
        bye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hh = new Intent(Geometry.this, MainActivity.class);
                startActivity(hh);
                Toast.makeText( Geometry.this, "Made by Abhinav Kumar" +
                        "                                                       St'Xavier's School" +
                        "                                                       Class 4 A" +
                        "                                                       Year 2017-18",Toast.LENGTH_SHORT ).show();
            }
        });

    }
        };



