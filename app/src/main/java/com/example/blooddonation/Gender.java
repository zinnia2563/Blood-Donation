package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gender extends AppCompatActivity {
    Button genderbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        genderbtn = findViewById(R.id.genderBtn_id);
        genderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genderbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Gender.this,Bloodgroup.class);
                        startActivity(intent);
                    }
                });
            }
        });


    }
}