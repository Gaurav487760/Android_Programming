package com.example.assign04setbq4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView tvBalance;
    private double Balance = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvBalance = findViewById(R.id.tv_balance);
        ListView listView = findViewById(R.id.listView);
        String[] menuOptions = {"Deposit", "Withdraw", "Check Balance"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1, menuOptions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            switch (position) {
                case 0: showTransactionDialog("Deposit"); break;
                case 1: showTransactionDialog("Withdraw"); break;
                case 2: Toast.makeText(this, "Current Balance: $" +
                        Balance, Toast.LENGTH_LONG).show(); break;
            }
        });
}
        private void showTransactionDialog(String type) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(type)
                    .setMessage("Enter amount:")
                    .setView(getLayoutInflater().inflate(R.layout.dialog_input, null))
                    .setPositiveButton("OK", (dialog, which) -> {
                        AlertDialog alertDialog = (AlertDialog) dialog;
                        TextView input =
                                alertDialog.findViewById(R.id.et_amount);
                        if (input != null) {
                            double amount =
                                    Double.parseDouble(input.getText().toString());
                            if (type.equals("Deposit")) {
                                Balance += amount;
                                Toast.makeText(this, "Deposited: $" + amount,
                                        Toast.LENGTH_SHORT).show();
                            } else if (type.equals("Withdraw") && amount <= Balance) {
                                Balance -= amount;
                                Toast.makeText(this, "Withdrawn: $" + amount,
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(this, "Insufficient funds!",
                                        Toast.LENGTH_SHORT).show();
                            }
                            tvBalance.setText("Balance: $" + Balance);
                        }
                    })
                    .setNegativeButton("Cancel", null)
                    .show();
        }
    }