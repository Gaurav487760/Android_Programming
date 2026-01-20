package com.example.assign02setbq1java;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMessage=findViewById(R.id.textViewMessage);
        String message=getIntent().getStringExtra("MESSAGE");
        textViewMessage.setText(message);
    }
}