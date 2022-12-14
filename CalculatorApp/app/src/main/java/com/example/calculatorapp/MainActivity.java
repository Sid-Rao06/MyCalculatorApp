package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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

        if(number1ET.getText().toString().length()>= 1){
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }else{
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().length()>= 1) {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 - num2;

            numberSumTV.setText("" + sum);
        }
    }

    public void findMultiple(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().length()>= 1) {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 * num2;

            numberSumTV.setText("" + sum);
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.secondNum);
        TextView numberSumTV = findViewById(R.id.answer);
        if( number1ET.getText().length()>=1) {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 / num2;


            numberSumTV.setText("" + sum);
        }
    }


}