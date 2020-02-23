package c.s.mathsclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Area extends AppCompatActivity {
private Button integer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        Button integer = (Button) findViewById(R.id.button);
        integer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toe  = new Intent(Area.this,MainActivity.class);
                startActivity(toe);
                Toast.makeText( Area.this, "Made by Abhinav Kumar" +
                        "                                                       St'Xavier's School" +
                        "                                                       Class 4 A" +
                        "                                                       Year 2017-18",Toast.LENGTH_SHORT ).show();
            }
        });

    }
}
