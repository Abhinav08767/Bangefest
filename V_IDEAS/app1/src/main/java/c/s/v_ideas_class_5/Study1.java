package c.s.v_ideas_class_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class Study1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study1);
        PDFView pdfView;


    /*    final WebView webview;

        webview = (WebView)findViewById(R.id.webview);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("http://www.gov.pe.ca/photos/original/eecd_gr6math.pdf");
        System.out.println("By Abhinav Kumar");
        */

    pdfView = (PDFView)findViewById(R.id.pdf1);

    pdfView.fromAsset("CH_1_ESTIMATION_AND_ROUNDING.pdf").load();




    }
}
