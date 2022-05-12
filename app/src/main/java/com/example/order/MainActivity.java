package com.example.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoLoginPage(View v){
        Intent L= new Intent(this,Login.class);
        startActivity(L);
    }

    public void gotoSignupPage(View v){
        Intent S = new Intent(this,signup.class);
        startActivity(S);
    }
}