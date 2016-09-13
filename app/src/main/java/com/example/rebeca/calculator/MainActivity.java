package com.example.rebeca.calculator;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;
    EditText number1 , number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btSum);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float sum = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        sum = num1 + num2;

        result.setText(sum + "");

    }
}