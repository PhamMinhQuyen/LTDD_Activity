package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {

    private EditText edt_user,edt_pass;
    private Button btt_login;

    public static String USER="USER";
    public static String PASS="PASS";
    public static String BUNDLE="BUNDLE";
    public ActivityA(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        edt_user=(EditText) findViewById(R.id.edt_user);
        edt_pass=(EditText) findViewById(R.id.edt_pass);
        btt_login=(Button) findViewById(R.id.btt_login);

        btt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=edt_user.getText().toString();
                String pass=edt_pass.getText().toString();
                //byExtras(user,pass);
                byBundle(user,pass);
            }
        });

    }
    public void byExtras(String user,String pass){
        Intent intent =new Intent(ActivityA.this,ActivityB.class);
        intent.putExtra(USER,user);
        intent.putExtra(PASS,pass);
        startActivity(intent);
    }
    public void byBundle(String user,String pass){
        Intent intent =new Intent(ActivityA.this,ActivityB.class);
        Bundle bundle=new Bundle();
        bundle.putString(USER,user);
        bundle.putString(PASS,pass);
        intent.putExtra(BUNDLE,bundle);
        startActivity(intent);
    }
}