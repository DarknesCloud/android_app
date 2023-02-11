package com.example.loginscreen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    public void RegisterScreen(View view){
        Intent i=new Intent(this, RegisterScreen.class);
        startActivity(i);
    }

    public void Calendar(View view){
        Intent i=new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void LoginStart1(View view){
        Intent i = new Intent(this, LoginStart.class);
        startActivity(i);
    }
}