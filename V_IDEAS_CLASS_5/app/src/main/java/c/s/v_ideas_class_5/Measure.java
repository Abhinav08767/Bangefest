
package c.s.v_ideas_class_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Measure extends AppCompatActivity {
    private Button pop;
    private Button rat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);




        Button pop = (Button)findViewById(R.id.button6);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                finish();
        };

        });








        Button rat = (Button)findViewById(R.id.button4);
        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my = new Intent(Measure.this, Study1.class);
                startActivity(my);



            }
        });




        


}
}
