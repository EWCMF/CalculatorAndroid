package com.android.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber;
    private EditText secondNumber;

    private TextView resultPlus;
    private TextView resultMinus;
    private TextView resultDivide;
    private TextView resultMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.editText2);
        secondNumber = findViewById(R.id.editText);

        resultPlus = findViewById(R.id.plusTV);
        resultMinus = findViewById(R.id.minusTV);
        resultDivide = findViewById(R.id.divideTV);
        resultMultiply = findViewById(R.id.multiplyTV);

        hideAllResults();
    }

    public void hideAllResults() {
        resultPlus.setVisibility(View.INVISIBLE);
        resultMinus.setVisibility(View.INVISIBLE);
        resultDivide.setVisibility(View.INVISIBLE);
        resultMultiply.setVisibility(View.INVISIBLE);
    }

    public void plus(View view) {
        if (firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty() || firstNumber.getText().toString().equals(".") || secondNumber.getText().toString().equals("."))
            return;

        hideAllResults();
        resultPlus.setVisibility(View.VISIBLE);
        double a = Double.parseDouble(firstNumber.getText().toString());
        double b = Double.parseDouble(secondNumber.getText().toString());
        resultPlus.setText(Calculator.add(a, b) + "");
    }

    public void minus(View view) {
        if (firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty() || firstNumber.getText().toString().equals(".") || secondNumber.getText().toString().equals("."))
            return;

        hideAllResults();
        resultMinus.setVisibility(View.VISIBLE);
        double a = Double.parseDouble(firstNumber.getText().toString());
        double b = Double.parseDouble(secondNumber.getText().toString());
        resultMinus.setText(Calculator.minus(a, b) + "");
    }

    public void multiply(View view) {
        if (firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty() || firstNumber.getText().toString().equals(".") || secondNumber.getText().toString().equals("."))
            return;

        hideAllResults();
        resultMultiply.setVisibility(View.VISIBLE);
        double a = Double.parseDouble(firstNumber.getText().toString());
        double b = Double.parseDouble(secondNumber.getText().toString());
        resultMultiply.setText(Calculator.mul(a, b) + "");
    }

    public void divide(View view) {
        if (firstNumber.getText().toString().isEmpty() || secondNumber.getText().toString().isEmpty() || firstNumber.getText().toString().equals(".") || secondNumber.getText().toString().equals("."))
            return;

        hideAllResults();
        resultDivide.setVisibility(View.VISIBLE);
        double a = Double.parseDouble(firstNumber.getText().toString());
        double b = Double.parseDouble(secondNumber.getText().toString());
        resultDivide.setText(Calculator.div(a, b) + "");
    }
}
