package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.project.R;

public class Dashboard extends AppCompatActivity {


    TextView edfullname,edemail,edpassword,eddob,edgender;

    TextView fullname,email,password,dob,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        fullname= findViewById(R.id.name);
        email= findViewById(R.id.email);
        gender =findViewById(R.id.gender);
        dob= findViewById(R.id.dob);
        fullname.setText(Common.getName(Dashboard.this));
        email.setText(Common.getEmail(Dashboard.this));
        gender.setText(Common.getGender(Dashboard.this));
        dob.setText(Common.getDob(Dashboard.this));

    }
}