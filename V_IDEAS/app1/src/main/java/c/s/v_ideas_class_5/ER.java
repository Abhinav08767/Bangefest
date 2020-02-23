package c.s.v_ideas_class_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ER extends AppCompatActivity {

    private Button ja;
    private Button mama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_er);

        Button ja = (Button)findViewById(R.id.button10);
        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button mama = (Button)findViewById(R.id.button7);
        mama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lava = new Intent(ER.this, Study2.class);
                startActivity(lava);
            }
        });





    }
}
