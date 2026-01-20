package com.example.assign02setc;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView profileDetails=findViewById(R.id.profileDetails);

        String name=getIntent().getStringExtra("name");
        String aadhar=getIntent().getStringExtra("aadhar");
        String dob= getIntent().getStringExtra("dob");
        String Gender=getIntent().getStringExtra("Gender");
        String Address=getIntent().getStringExtra("Address");
        String Contact=getIntent().getStringExtra("Contact");

        String profileInfo="Name:"+name+"\n"+
                "Aadhar ID:"+aadhar+"\n"+
                "Date of Birth:"+dob+"\n"+
                "Address:"+Address+"\n"+
                "Gender:"+Gender+"\n"+
                "Contact:"+Contact;
        profileDetails.setText(profileInfo);
    }
}