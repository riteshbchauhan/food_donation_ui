package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.imageview.ShapeableImageView;

public class ngo_donationrequests extends AppCompatActivity {
    ImageView ngo_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_donationrequests);

        ngo_profile = findViewById(R.id.ngo_profile);
        ngo_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ngo_donationrequests.this,ngo_profile.class));
            }
        });
    }
}