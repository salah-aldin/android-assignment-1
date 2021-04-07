package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        infoText = findViewById(R.id.infoText);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("mobileNumber");
        String birthDate = intent.getStringExtra("birthDate");
        String spinner = intent.getStringExtra("spinner");

        infoText.setText(  name + "\n" +
                        email + "\n" +
                        phone + "\n" +
                        birthDate + "\n" +
                        spinner + "\n"
                );
    }


}