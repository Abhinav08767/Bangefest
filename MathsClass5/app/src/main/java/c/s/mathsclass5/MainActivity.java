package c.s.mathsclass5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Button estimation;
    private Button system;
    private Button geometry;
    private Button perimetre;
    private Button area;
    private Button df;
    private Button exi;
    private Spinner Spinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button estimation = (Button)findViewById(R.id.btn3);
        estimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EstimationRounding.class);
                        startActivity(i);
            }
        });


        Button system = (Button)findViewById(R.id.btn2);
        system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(MainActivity.this, System.class);
                startActivity(y);
            }
        });

        Button geometry = (Button)findViewById(R.id.btn4);
        geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, Geometry.class);
                startActivity(j);

            }
        });


        Button perimetre = (Button)findViewById(R.id.btn5);
        perimetre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this, Geometry.class);
                startActivity(g);


            }

            });

        final Button area = (Button)findViewById(R.id.btn7);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, Area.class);
                startActivity(k);
            }
        });



        Button df = (Button)findViewById(R.id.btn8);
        df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,df.class);
                startActivity(toy);
            }
        });




        Button exi = (Button)findViewById(R.id.btn1);
        exi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });



        Spinner spinn = (Spinner)findViewById(R.id.spn1);
       String text1 = String.valueOf(spinn.getSelectedItem());

        String[] options = new String[] {
                 "CH-1 Estimation And Rounding", "CH-Metric System", "CH-3 Geometry", "CH-4 Perimetre", "CH-5 Area", "CH-6 Decimal And Fraction"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(adapter);
        Spinner spinner1 = (Spinner) findViewById(R.id.spn1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, options);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
    }
}
