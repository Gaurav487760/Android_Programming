package com.example.colorbutton;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textSample;
    Button btnBlue,btnRed, btnGreen,btnYellow;
    float size = 22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSample = findViewById(R.id.textSample);
        btnBlue = findViewById(R.id.btnBlue);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);

        btnBlue.setOnClickListener(v -> textSample.setTextColor(Color.BLUE));

        btnRed.setOnClickListener(v -> textSample.setTextColor(Color.RED));

        btnGreen.setOnClickListener(v -> textSample.setTextColor(Color.GREEN));

        btnYellow.setOnClickListener(v -> textSample.setTextColor(Color.YELLOW));
    }

}