package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.imageview.ShapeableImageView;

public class r_donationrequests extends AppCompatActivity {
    ShapeableImageView res_profile;
    CardView confirm_request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdonationrequests);

        confirm_request = findViewById(R.id.confirm_request);
        confirm_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_donationrequests.this, r_confirmrequests.class));
            }
        });

        res_profile = findViewById(R.id.res_profile);
        res_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_donationrequests.this, r_profile.class));
            }
        });
    }
}