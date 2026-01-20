package com.example.assign02setbq2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
TextView displayInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayInfo=findViewById(R.id.textViewDisplay);

        String FirstName=getIntent().getStringExtra("First_name");
        String Middlename=getIntent().getStringExtra("Middle_name");
        String Lastname=getIntent().getStringExtra("Last_name");
        String DOB=getIntent().getStringExtra("DOB");
        String Address=getIntent().getStringExtra("Address");
        String Email=getIntent().getStringExtra("Email");

        String userInfo="First name:"+FirstName+"\n"+
                "Middle name:"+Middlename+"\n"+
                "Last name:"+Lastname+"\n"+
                "Date of Birth:"+DOB+"\n"+
                "Address:"+Address+"\n"+
                "Email:"+Email;

        displayInfo.setText(userInfo);

    }
}