package com.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Bimal extends AppCompatActivity implements View.OnClickListener {

    private TextView tvTaxResult;
    private EditText etSalary;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTaxResult = findViewById(R.id.tvTaxResult);
        etSalary = findViewById(R.id.etSalary);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnCalculate)
        {
            tvTaxResult.setText(Double.toString(new TaxCalculator_Bimal(Double.parseDouble(etSalary.getText().toString())).calculate()));
        }
    }
}
