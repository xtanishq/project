package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project.R;

public class Login extends AppCompatActivity {
    EditText edemail,edpassword;
    Button login;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edemail= findViewById(R.id.email);
        edpassword =findViewById(R.id.password);
        login= findViewById(R.id.login);


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


    }


}