package c.s.v_ideas_class_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class geo extends AppCompatActivity {
    private Button man;
    private Button kite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        Button man = (Button)findViewById(R.id.button16);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




        Button kite = (Button)findViewById(R.id.button15);
        kite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mall = new Intent(geo.this, Study3.class);
                startActivity(mall);
            }
        });
    }
}
