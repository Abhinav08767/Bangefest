package c.s.v_ideas_class_5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Symmetry extends AppCompatActivity {
    private Button mat;
    private Button fault;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symmetry);

        Button mat = (Button)findViewById(R.id.button26);
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sorrow = new Intent(Symmetry.this, Study6.class);
                startActivity(sorrow);
            }
        });

        Button fault = (Button)findViewById(R.id.button25);
        fault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

}
