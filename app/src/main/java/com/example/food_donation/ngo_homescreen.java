package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.imageview.ShapeableImageView;

public class ngo_homescreen extends AppCompatActivity {

    Button ngodonationrequests, ngorequesthistory;
    ShapeableImageView ngo_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_homescreen);

        ngodonationrequests = findViewById(R.id.ngodonationrequests);
        ngorequesthistory = findViewById(R.id.ngorequesthistory);
        ngo_profile = findViewById(R.id.ngo_profile);

        ngodonationrequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ngo_homescreen.this, ngo_donationrequests.class));
            }
        });

        ngorequesthistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ngo_homescreen.this, ngo_requesthistory.class));
            }
        });

        ngo_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ngo_homescreen.this, ngo_profile.class));
            }
        });
    }
}