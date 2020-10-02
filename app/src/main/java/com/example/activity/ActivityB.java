package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {


    private TextView tv_user,tv_pass;
    private Button btt_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        tv_user=(TextView) findViewById(R.id.tv_user);
        tv_pass=(TextView) findViewById(R.id.tv_pass);
        btt_logout=(Button) findViewById(R.id.btt_logout);

        btt_logout.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v) {
                    finish();
            }
        });

        //setDataByExtras();
        setDataByBundle();


    }
    public void setDataByExtras(){
        Intent intent=getIntent();
        String user=intent.getStringExtra(ActivityA.USER);
        String pass=intent.getStringExtra(ActivityA.PASS);

        tv_user.setText(user);
        tv_pass.setText(pass);
    }
    public void setDataByBundle(){
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra(ActivityA.BUNDLE);
        String user=bundle.getString(ActivityA.USER);
        String pass=bundle.getString(ActivityA.PASS);

        tv_user.setText(user);
        tv_pass.setText(pass);
    }

}