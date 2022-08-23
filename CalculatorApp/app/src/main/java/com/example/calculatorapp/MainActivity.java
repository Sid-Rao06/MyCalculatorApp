package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }

    public void findMultiple(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }

}