package com.example.assign3setbq1;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnInsertContact =
                findViewById(R.id.btnInsertContact);
        btnInsertContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertNewContact();
            }
        });
    }
    private void insertNewContact() {
        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        intent.putExtra(ContactsContract.Intents.Insert.NAME, "John Doe");
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,
                        "(650)253-0000");
        startActivity(intent);
    }
}