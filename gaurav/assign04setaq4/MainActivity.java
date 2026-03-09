package com.example.assign04setaq4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private boolean isOn = false;  // Initial bulb state
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bulbImage = findViewById(R.id.bulbImage);
        Button toggleButton = findViewById(R.id.toggleButton);
// Set button click listener
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOn) {
                    bulbImage.setImageResource(R.drawable.bulb_off);  // Bulb off
                    toggleButton.setText("Turn ON");
                    isOn = false;
                } else {
                    bulbImage.setImageResource(R.drawable.bulb_on);  // Bulb on
                    toggleButton.setText("Turn OFF");
                    isOn = true;
                }
            }
        });
    }
}