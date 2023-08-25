package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.project.MainActivity;
import com.example.project.R;

public class SignUp extends AppCompatActivity {
    EditText edfullname,edemail,edpassword,eddob,edgender;
    Button signup;
    String fullname,email,password,dob,gender;
    SharedPreferences sp;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        sp = getSharedPreferences("FILE", MODE_PRIVATE);
        editor = sp.edit();
        edfullname= findViewById(R.id.fullName);
        edemail= findViewById(R.id.email);
        edpassword =findViewById(R.id.password);
        eddob= findViewById(R.id.dob);
        signup= findViewById(R.id.signup2);
        radioGroup= findViewById(R.id.radiogrp);
//        radioButton = (RadioButton) findViewById(selectedId);


        String selectedId = String.valueOf(radioGroup.getCheckedRadioButtonId());
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
editTextToString();
            }
        });

    }

    private void editTextToString() {
//        String fullname,email,password,dob,gender;
        fullname=edfullname.getText().toString().trim();
        email=edemail.getText().toString().trim();
        password=edpassword.getText().toString().trim();
        dob=eddob.getText().toString().trim();
        dob=eddob.getText().toString().trim();
        upload();

    }

    private void upload() {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(SignUp.this);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name",fullname);
        editor.putString("email",email);
        editor.putString("password",password);
        editor.putString("gender",gender);
        editor.putString("dob",dob);
        editor.apply();

        startActivity(new Intent(SignUp.this,Login.class));
    }
}