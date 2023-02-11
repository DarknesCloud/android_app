package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_start);
        getSupportActionBar().hide();
    }

    public void LoginScreen(View view){
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }
    public void RegisterScreen(View view){
        Intent i=new Intent(this, RegisterScreen.class);
        startActivity(i);
    }
    public void LoginScreen2(View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}