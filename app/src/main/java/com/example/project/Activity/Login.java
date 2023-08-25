package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.R;

public class Login extends AppCompatActivity {
    EditText edemail,edpassword;
    Button login;
    TextView txt;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edemail= findViewById(R.id.lemail);
        edpassword =findViewById(R.id.lpassword);
        txt =findViewById(R.id.txt);
        login= findViewById(R.id.login);
        Toast.makeText(this, Common.getEmail(Login.this) + " " + Common.getPassword(Login.this), Toast.LENGTH_SHORT).show();
txt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(Login.this,SignUp.class));
    }
});
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        editTextToString();


    }
});



    }

    private void editTextToString() {


        email=edemail.getText().toString().trim();
        password=edpassword.getText().toString().trim();
verifyUser();

    }

    private void verifyUser() {

        if (email == Common.getEmail(Login.this) && password == Common.getPassword(Login.this)) {

            Toast.makeText(this, "wrong details", Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(new Intent(Login.this, Dashboard.class));

        }
    }


}