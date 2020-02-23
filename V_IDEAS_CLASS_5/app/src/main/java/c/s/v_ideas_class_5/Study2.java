package c.s.v_ideas_class_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study2 extends AppCompatActivity {
    PDFView man;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study2);

        man = findViewById(R.id.pdf2);

        man.fromAsset("CH_1_ESTIMATION_AND_ROUNDING").load();



    }
}
