package com.example.assign02q2hellojava;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=findViewById(R.id.messageTextView);
        String message=getIntent().getStringExtra("Message");
        if(message!=null) {
            textView.setText(message);
        }
    }
}