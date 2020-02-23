package c.s.v_ideas_class_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sets extends AppCompatActivity {
    private Button pot;
    private Button correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);


        Button pot = (Button)findViewById(R.id.button24);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button correct = (Button)findViewById(R.id.button22);
        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gg = new Intent(sets.this, Study5.class);
                startActivity(gg);
            }
        });


    }
}
