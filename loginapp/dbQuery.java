package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dbQuery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_query);

        Bundle bundle = getIntent().getExtras();
        String varUsername = bundle.getString("USERNAME");
        String varPassword = bundle.getString("PASSWORD");

        TextView objData = findViewById(R.id.txtData);
        objData.setText(varUsername);
        System.out.println(varUsername + "\t" + varPassword);

        Button objBack = (Button) findViewById(R.id.btnBack);
        objBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}