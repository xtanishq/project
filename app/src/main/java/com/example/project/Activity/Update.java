package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project.R;

public class Update extends AppCompatActivity {


    EditText edfullname,edemail,edpassword,eddob,edgender;
    Button update;
    String fullname,email,password,dob,gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        edfullname= findViewById(R.id.fullName);
        edemail= findViewById(R.id.email);
        edpassword =findViewById(R.id.password);
        eddob= findViewById(R.id.dob);
        update= findViewById(R.id.update);


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextToString();
            }
        });
    }

    private void editTextToString() {

        fullname=edfullname.getText().toString().trim();
        email=edemail.getText().toString().trim();
        password=edpassword.getText().toString().trim();
        dob=eddob.getText().toString().trim();
        update();

    }

    private void update() {
        PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().clear().apply();

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(Update.this);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("name",fullname);
        editor.putString("email",email);
        editor.putString("password",password);
        editor.putString("gender",gender);
        editor.putString("dob",dob);
        editor.apply();
startActivity(new Intent(Update.this,Dashboard.class));
    }
}