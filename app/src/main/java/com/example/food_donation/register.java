package com.example.food_donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class register extends AppCompatActivity {

    Button r_login;
    RadioButton rbngo,rbres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        r_login = findViewById(R.id.r_login);
        r_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, signin.class));
            }
        });

        rbngo = findViewById(R.id.rbngo);
        rbres = findViewById(R.id.rbres);

        rbngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, ngo_homescreen.class));
            }
        });
        rbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, r_homescreen.class));
            }
        });
    }
}