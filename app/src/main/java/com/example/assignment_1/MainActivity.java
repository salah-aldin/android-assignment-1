package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameText;
    private EditText lastNameText;
    private EditText emailText;
    private EditText mobileNumberText;
    private EditText passwordText;
    private EditText confirmPasswordText;
    private EditText birthDateText;

    private Spinner spinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameText = findViewById(R.id.firstNameText);
        lastNameText = findViewById(R.id.lastNameText);
        emailText = findViewById(R.id.emailText);
        mobileNumberText = findViewById(R.id.mobileNumberText);
        passwordText = findViewById(R.id.passwordText);
        confirmPasswordText = findViewById(R.id.confirmPasswordText);
        birthDateText = findViewById(R.id.birthDateText);
        spinner = findViewById(R.id.spinner);
        
        
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ramallah");
        cities.add("Jerusalem");
        cities.add("Nablus");
        cities.add("Jerihco");
        cities.add("Hebron");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
        spinner.setAdapter(arrayAdapter);


    }

    public void signupButtonClicked(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        String nameStr = firstNameText.getText().toString() + " " + lastNameText.getText().toString();
        String emailStr = emailText.getText().toString();
        String mobileNumberStr = mobileNumberText.getText().toString();
        String birthDateStr = birthDateText.getText().toString();
        String spinnerStr = spinner.getSelectedItem().toString();

        /*
        String country = this.country.getSelectedItem().toString();
        boolean human = this.human.isChecked();
        float rating = this.rating.getRating();
        */


        intent.putExtra("name", nameStr);
        intent.putExtra("email", emailStr);
        intent.putExtra("mobileNumber", mobileNumberStr);
        intent.putExtra("birthDate", birthDateStr);
        intent.putExtra("spinner", spinnerStr);

        startActivity(intent);
    }
}