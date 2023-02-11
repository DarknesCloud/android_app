package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
}