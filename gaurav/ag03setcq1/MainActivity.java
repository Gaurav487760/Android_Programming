package com.example.ag03setcq1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        String[] coffeeTypes = {"Filter", "Americano", "Latte",
                "Espresso", "Cappuccino", "Mocha", "Skinny Latte", "Espresso","Corretto"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                        R.layout.spinner_item, coffeeTypes);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(adapter);
}
    }