package c.s.mathsclass5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.net.URI;

import static android.net.Uri.fromFile;

public class EstimationRounding extends AppCompatActivity {

    private Button kumfoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimation_rounding);


      /*  File file = new File(Environment.getExternalStorageDirectory(),
                "E:\\ABhinav\\er.ppt");

        Uri path = Uri.fromFile(file);


        Intent   pdfOpenintent = new Intent(Intent.ACTION_VIEW);
        pdfOpenintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        pdfOpenintent.setDataAndType(path, "application/ppt");
        try {
            startActivity(pdfOpenintent);
        }
        catch (ActivityNotFoundException e) {

        }*/


       // Intent intent = new Intent();
       // intent.setAction(Intent.ACTION_VIEW);
        //intent.setDataAndType(Uri.parse("/mnt/sdcard/xxx/xxx/Pictures/xxx.jpg"), "image/.startActivity(intent);
        Button kumfoo = (Button)findViewById(R.id.butn2);
        kumfoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(EstimationRounding.this, MainActivity.class);
                startActivity(j);
                Toast.makeText( EstimationRounding.this, "Made by Abhinav Kumar" +
                        "                                                       St'Xavier's School" +
                        "                                                       Class 4 A" +
                        "                                                       Year 2017-18",Toast.LENGTH_SHORT ).show();
            }
        });
            }
        }




