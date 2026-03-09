package com.example.assign04setbq1;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText etName, etEmail, etPassword, etAge,
            etMobile;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etAge = findViewById(R.id.etAge);
        etMobile = findViewById(R.id.etMobile);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndRegister();
            }
        });
    }
    private void validateAndRegister() {
        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String ageStr = etAge.getText().toString().trim();
        String mobile = etMobile.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            showMessage("Error", "Please enter your name.");
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            showMessage("Error", "Please enter a valid email.");
            return;
        }
        if (password.length() < 6) {
            showMessage("Error", "Password must be at least 6 characters.");
            return;
        }
        if (TextUtils.isEmpty(ageStr) || Integer.parseInt(ageStr) < 18) {
            showMessage("Error", "Age must be 18 or above.");
            return;
        }
        if (!Patterns.PHONE.matcher(mobile).matches() ||
                mobile.length() != 10) {
            showMessage("Error", "Enter a valid 10-digit mobile number.");
            return;
        }
        showMessage("Success", "Registration successful!");
    }
    private void showMessage(String title, String message) {
        DialogFragment dialog = MessageDialogFragment.newInstance(title, message);
        dialog.show(getSupportFragmentManager(),
                "MessageDialog");
    }
}