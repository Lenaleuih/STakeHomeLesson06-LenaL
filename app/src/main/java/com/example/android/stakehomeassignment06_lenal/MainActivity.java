package com.example.android.stakehomeassignment06_lenal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText amount;
    private EditText taxPercentage;
    private EditText tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Tip Calculator");
        amount = (EditText) findViewById(R.id.amount);
        taxPercentage = (EditText) findViewById(R.id.taxPercentage);
        tipPercentage = (EditText) findViewById(R.id.tipPercentage);
    }

    public void submit(View view) {
        double total = Double.parseDouble(amount.getText().toString());
        new DecimalFormat("0").format(total);
        double tax = Double.parseDouble(taxPercentage.getText().toString());
        new DecimalFormat("00").format(tax);
        double tip = Double.parseDouble(tipPercentage.getText().toString());
        new DecimalFormat("00").format(tip);


        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("total", total);
        intent.putExtra("tax", tax);
        intent.putExtra("tip", tip);

        startActivity(intent);
    }
}
