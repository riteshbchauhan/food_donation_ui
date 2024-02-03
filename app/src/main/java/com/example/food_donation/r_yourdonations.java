package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.imageview.ShapeableImageView;

public class r_yourdonations extends AppCompatActivity {
    ShapeableImageView res_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryourdonations);

        res_profile = findViewById(R.id.res_profile);
        res_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(r_yourdonations.this, r_profile.class));
            }
        });
    }
}