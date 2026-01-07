package com.example.assignment01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textSample;
    Button btnIncrease,btnRed,btnBold;
    float size = 22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSample = findViewById(R.id.textSample);
        btnIncrease = findViewById(R.id.btnIncrease);
        btnRed = findViewById(R.id.btnRed);
        btnBold = findViewById(R.id.btnBold);

        btnIncrease.setOnClickListener(v -> {
            size += 2;
            textSample.setTextSize(size);
        });

        btnRed.setOnClickListener(v -> textSample.setTextColor(Color.RED));

        btnBold.setOnClickListener(v -> textSample.setTypeface(null, Typeface.BOLD));
    }

}
