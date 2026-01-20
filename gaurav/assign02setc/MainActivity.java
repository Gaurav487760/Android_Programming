package com.example.assign02setc;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bookButton=findViewById(R.id.bookButton);
        bookButton.setOnClickListener(view ->{
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","Rovel Pinto");
            intent.putExtra("aadhar","1234 5678 7890");
            intent.putExtra("dob","29/01/2001");
            intent.putExtra("Gender","Male");
            intent.putExtra("Address","Mumbai");
            intent.putExtra("Contact","9805795670");
            startActivity(intent);
        });
    }
}