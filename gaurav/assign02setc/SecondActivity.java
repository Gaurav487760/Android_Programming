package com.example.assign02setc;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button showProfileButton=findViewById(R.id.showProfileButton);
        showProfileButton.setOnClickListener(view->{
            Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtras(getIntent());
            startActivity(intent);
        });
    }
}