package projectise.science5;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  //  private  EditText science;
//private Button start;
//private EditText  hello;

    //@Override
private void eate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        science= (EditText)findViewById(R.id.et1);
        science.setEnabled(false);
        start= (Button)findViewById(R.id.btn1);
        start.setOnClickListener(this);

        hello= (EditText)findViewById(R.id.edt2);
        hello.setEnabled(false);






}




    }

