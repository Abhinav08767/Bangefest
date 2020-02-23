package c.s.mathsclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class df extends AppCompatActivity {
private Button dj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df);
        Button dj = (Button)findViewById(R.id.button12);
        dj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nn = new Intent(df.this, MainActivity.class);
                startActivity(nn);
                Toast.makeText( df.this, "Made by Abhinav Kumar" +
                        "                                                       St'Xavier's School" +
                        "                                                       Class 4 A" +
                        "                                                       Year 2017-18",Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
