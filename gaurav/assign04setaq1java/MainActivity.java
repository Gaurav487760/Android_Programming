package com.example.assign04setaq1java;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
// Creating a sample contact
        Contact contact = new Contact("John Doe", "+1234567890",
                "john.doe@gmail.com", R.drawable.person);
        ImageView contactImage = findViewById(R.id.contactImage);
        TextView contactName = findViewById(R.id.contactName);
        TextView contactNumber = findViewById(R.id.contactNumber);
        TextView contactEmail = findViewById(R.id.contactEmail);
        contactImage.setImageResource(contact.getPhoto());
        contactName.setText(contact.getName());
        contactNumber.setText(contact.getContactNumber());
        contactEmail.setText(contact.getEmail());
    }
}
