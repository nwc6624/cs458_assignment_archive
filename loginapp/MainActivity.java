package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View view)
    {
        Intent myIntent = new Intent(this, dbQuery.class);
        EditText objUsername = findViewById(R.id.txtUsername);
        EditText objPassword = findViewById(R.id.txtPassword);

        String varUserName = objUsername.getText().toString();
        String varPassword = objPassword.getText().toString();
        myIntent.putExtra("USERNAME", varUserName);
        myIntent.putExtra("PASSWORD", varPassword);

        startActivity(myIntent);


    }
}