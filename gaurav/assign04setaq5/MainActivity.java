package com.example.assign04setaq5;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private ImageView imageView;
    private Map<String, Integer> imageMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = findViewById(R.id.datePicker);
        imageView = findViewById(R.id.imageView);
        imageMap = new HashMap<>();
        imageMap.put("2025-03-08", R.drawable.image1);
        imageMap.put("2025-03-09", R.drawable.image2);
        imageMap.put("2025-03-10", R.drawable.image3);
        datePicker.setOnDateChangedListener((view, year, month, day) -> {
            String selectedDate = year + "-" + String.format("%02d", (month + 1))
                    + "-" + String.format("%02d", day);
            if (imageMap.containsKey(selectedDate)) {
                imageView.setImageResource(imageMap.get(selectedDate));
            } else {
                imageView.setImageResource(R.drawable.default_image);
            }
        });
    }
}