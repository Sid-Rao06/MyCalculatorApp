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

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

}