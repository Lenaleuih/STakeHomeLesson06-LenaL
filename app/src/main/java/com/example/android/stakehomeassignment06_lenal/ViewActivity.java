package com.example.android.stakehomeassignment06_lenal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    private double total;
    private double tax;
    private double tip;
    private double grandTotal;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        setTitle("Your Receipt");

        display = (TextView) findViewById(R.id.display);

        Intent mIntent = getIntent();
        total = mIntent.getExtras().getDouble("total");
        tax = mIntent.getExtras().getDouble("tax") * total;
        tip = mIntent.getExtras().getDouble("tip") * total;
        grandTotal = total + tax + tip;

        display.setText("Total: " + total + "\nSales Tax: " + tax + "\nTip: " + tip + "\nGrand Total: " +
                grandTotal);
    }
}
