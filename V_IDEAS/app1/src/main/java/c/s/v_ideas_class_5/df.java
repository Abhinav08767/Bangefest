package c.s.v_ideas_class_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class df extends AppCompatActivity {
    private Button run;
    private Button tod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df);


        Button run = (Button)findViewById(R.id.button19);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button tod = (Button)findViewById(R.id.button17);
        tod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathch = new Intent(df.this, Study4.class);
                startActivity(mathch);
            }
        });

    }
}
