package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.R;

public class Dashboard extends AppCompatActivity {


    TextView edfullname,edemail,edpassword,eddob,edgender;
Button delete,update;
    TextView fullname,email,password,dob,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        fullname= findViewById(R.id.name);
        delete= findViewById(R.id.delete);
        update= findViewById(R.id.update);
        email= findViewById(R.id.email);
        gender =findViewById(R.id.gender);
        dob= findViewById(R.id.dob);
        fullname.setText(Common.getName(Dashboard.this));
        email.setText(Common.getEmail(Dashboard.this));
        gender.setText(Common.getGender(Dashboard.this));
        dob.setText(Common.getDob(Dashboard.this));
update.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      startActivity(new Intent(Dashboard.this,Update.class));
    }
});
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit().clear().apply();
                Toast.makeText(Dashboard.this, Common.getName(Dashboard.this)+ "Data deleted", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Dashboard.this,SignUp.class));
            }
        });

    }


}