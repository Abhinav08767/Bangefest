package com.valistchat.example.travelspot;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    EditText e4 , e6 , e5;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        e4=(EditText)findViewById(R.id.editText5);
        e5=(EditText)findViewById(R.id.editText7);
        e6=(EditText)findViewById(R.id.editText6);
       auth=FirebaseAuth.getInstance();
        dialog=new ProgressDialog(this);
    }

    public void signUpUser(View v){
        dialog.setMessage("Registering, Please wait!");
        dialog.show();
            System.out.println("test");
        String name = e4.getText().toString();
        String email = e5.getText().toString();
        String password = e6.getText().toString();

        if (name.equals("") || email.equals("") || password.equals("") ){
            Toast.makeText(getApplicationContext(),"Fields cannot be left blank",Toast.LENGTH_SHORT).show();
        }

        auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(), "User Registered successfully", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Sorry! User cannot be registered", Toast.LENGTH_SHORT);
                        }
                    }
                });

    }
}
