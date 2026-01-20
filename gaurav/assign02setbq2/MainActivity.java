package com.example.assign02setbq2;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Firstname,Middlename,Lastname,DOB,Address,Email;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firstname=findViewById(R.id.editTextFirstName);
        Middlename=findViewById(R.id.editTextMiddletName);
        Lastname=findViewById(R.id.editTextLastName);
        DOB=findViewById(R.id.editTextDOB);
        Address=findViewById(R.id.editTextAddress);
        Email=findViewById(R.id.editTextEmail);
        submitButton=findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("First_name",Firstname.getText().toString());
                    intent.putExtra("Middle_name",Middlename.getText().toString());
                    intent.putExtra("Last_name",Lastname.getText().toString());
                    intent.putExtra("DOB",DOB.getText().toString());
                    intent.putExtra("Address",Address.getText().toString());
                    intent.putExtra("Email",Email.getText().toString());
                    startActivity(intent);
            }
        });
    }
}