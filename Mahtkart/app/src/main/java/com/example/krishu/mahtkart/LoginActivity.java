package com.example.krishu.mahtkart;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.krishu.mahtkart.Model.Users;
import com.example.krishu.mahtkart.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rey.material.widget.CheckBox;

import io.paperdb.Paper;

public class LoginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;
    private String ParentDBName = "Users";
    private CheckBox checkBoxRememberMe;
    private TextView adminLink, notAdminLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button)findViewById(R.id.login_btn);
        InputPhoneNumber = (EditText)findViewById(R.id.login_phone_number_input);
        InputPassword = (EditText)findViewById(R.id.login_Password_input);
        loadingBar = new ProgressDialog(this);
        checkBoxRememberMe = (CheckBox)findViewById(R.id.remember_me_chb);
        adminLink = (TextView)findViewById(R.id.admin_panel_link);
        notAdminLink = (TextView)findViewById(R.id.not_admin_panel_link);
        Paper.init(this);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginUser();
            }
        });
    }



    private void LoginUser()
    {
        String phone = InputPhoneNumber.getText().toString();
        String password = InputPassword.getText().toString();

        if (TextUtils.isEmpty(phone))
    {
        Toast.makeText(this, "Please write your Phone Number", Toast.LENGTH_SHORT).show();
    }
    else if (TextUtils.isEmpty(password))
    {
        Toast.makeText(this, "Please write your Password", Toast.LENGTH_SHORT).show();
    }
    else
        {
            loadingBar.setTitle("Login Account");
            loadingBar.setMessage("Please wait while we are checking the Credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();
        }

        AllowAccessToAccount(phone, password);

        if (checkBoxRememberMe.isChecked())
        {
        Paper.book().write(Prevalent.userPhoneKey, phone);
        Paper.book().write(Prevalent.userPasswordKey, password);
        }

    }

    private void AllowAccessToAccount(final String phone, final String password)
    {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                if (dataSnapshot.child(ParentDBName).child(phone).exists())
                {
                    Users usersData = dataSnapshot.child(ParentDBName).child(phone).getValue(Users.class);

                    if (usersData.getPhone().equals(phone))
                    {
                        if (usersData.getPassword().equals(password))
                        {
                            if (ParentDBName.equals("Admins"))
                            {
                                Toast.makeText(LoginActivity.this, "Welcome Admin, You are Logged In Successfully", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();

                                Intent mainintent = new Intent(LoginActivity.this, AdminActivity.class);
                                startActivity(mainintent);
                            }

                            else if (ParentDBName.equals("Users"))
                            {
                                Toast.makeText(LoginActivity.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();

                                Intent mainintent = new Intent(LoginActivity.this, HomeActivity.class);
                                startActivity(mainintent);
                            }
                        }
                    }
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Account with this "+phone+"do not exist.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        adminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Login Admin");
                adminLink.setVisibility(View.INVISIBLE);
                notAdminLink.setVisibility(View.VISIBLE);
                ParentDBName = "Admins";
            }
        });

        notAdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Login");
                adminLink.setVisibility(View.VISIBLE);
                notAdminLink.setVisibility(View.INVISIBLE);
                ParentDBName = "Users";
            }
        });

    }
}
