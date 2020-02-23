package c.s.v_ideas_class_5;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity {
    private Button bye;
    private Button kite;
    private Button nice;
    private Button kk;
    private Button pen;
    private Button ri;
    private Button hen;
    private Button morgan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);



    Button bye = (Button)findViewById(R.id.button2);
    bye.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
             finish();
           //  Button bye = (Button)findViewById(R.id.button2);
             //bye.setOnClickListener(new View.OnClickListener() {
               //  @Override
                 //public void onClick(View v) {
                   //  finish();





                 }
             });

        Button kite = (Button)findViewById(R.id.btn4);
        kite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Abhinav");

                Intent j = new Intent(FrontPage.this, Informal.class);
                startActivity(j);











                            }
                });




        final Button nice = (Button)findViewById(R.id.button8);
        nice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lk = new Intent(FrontPage.this, ER.class);
                startActivity(lk);

















            }
        });



        Button kk = (Button)findViewById(R.id.btn9);
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp = new Intent(FrontPage.this, Measure.class);
                startActivity(pp);
            }
        });


        Button pen = (Button)findViewById(R.id.button11);
        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(FrontPage.this, df.class);
                startActivity(p);




            }
        });




        Button ri  = (Button)findViewById(R.id.button12);
        ri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(FrontPage.this, geo.class);
                startActivity(p);

            }
        });


        Button hen = (Button)findViewById(R.id.button20);
        hen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mj = new Intent(FrontPage.this, sets.class);
                startActivity(mj);
            }
        });

        Button morgan = (Button)findViewById(R.id.button21);
        morgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rr = new Intent(FrontPage.this, Symmetry.class);
                startActivity(rr);
            }
        });

        }
    }

