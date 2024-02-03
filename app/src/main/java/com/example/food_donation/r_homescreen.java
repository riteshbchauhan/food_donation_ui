package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.imageview.ShapeableImageView;

public class r_homescreen extends AppCompatActivity {
    Button resmakedonation,resyourdonations,resdonationrequests;
    ShapeableImageView res_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhomescreen);
        resmakedonation = findViewById(R.id.resmakedonation);
        resyourdonations = findViewById(R.id.resyourdonations);
        resdonationrequests = findViewById(R.id.resdonationrequests);

        res_profile = findViewById(R.id.res_profile);
        res_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_homescreen.this, r_profile.class));
            }
        });

        resmakedonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_homescreen.this, r_makedonation.class));
            }
        });

        resyourdonations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_homescreen.this, r_yourdonations.class));
            }
        });

        resdonationrequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_homescreen.this, r_donationrequests.class));
            }
        });
    }
}