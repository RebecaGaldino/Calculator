package com.example.rebeca.calculator;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rebeca.calculator.listeners.OnClickClearScreen;
import com.example.rebeca.calculator.listeners.OnClickEquals;
import com.example.rebeca.calculator.listeners.OnClickNumber;
import com.example.rebeca.calculator.listeners.OnClickOperators;

import java.util.regex.Pattern;

import butterknife.*;

public class MainActivity extends Activity{

    public TextView screen;
    public String screenUpdate = "";
    public String op = "";
    public Double number;
    @BindView(R.id.btn0) Button btn0;
    @BindView(R.id.btn1) Button btn1;
    @BindView(R.id.btn2) Button btn2;
    @BindView(R.id.btn3) Button btn3;
    @BindView(R.id.btn4) Button btn4;
    @BindView(R.id.btn5) Button btn5;
    @BindView(R.id.btn6) Button btn6;
    @BindView(R.id.btn7) Button btn7;
    @BindView(R.id.btn8) Button btn8;
    @BindView(R.id.btn9) Button btn9;
    @BindView(R.id.btnp) Button btnp;

    @BindView(R.id.del) Button del;
    @BindView(R.id.equals) Button equals;

    @BindView(R.id.div) Button div;
    @BindView(R.id.mult) Button mult;
    @BindView(R.id.sub) Button sub;
    @BindView(R.id.add) Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        screen = (TextView) findViewById(R.id.screen);
        updateScreen();


        //Buttons' functions parses, using the listeners
        btn0.setOnClickListener(new OnClickNumber(this));
        btn1.setOnClickListener(new OnClickNumber(this));
        btn2.setOnClickListener(new OnClickNumber(this));
        btn3.setOnClickListener(new OnClickNumber(this));
        btn4.setOnClickListener(new OnClickNumber(this));
        btn5.setOnClickListener(new OnClickNumber(this));
        btn6.setOnClickListener(new OnClickNumber(this));
        btn7.setOnClickListener(new OnClickNumber(this));
        btn8.setOnClickListener(new OnClickNumber(this));
        btn9.setOnClickListener(new OnClickNumber(this));
        btnp.setOnClickListener(new OnClickNumber(this));

        div.setOnClickListener(new OnClickOperators(this));
        mult.setOnClickListener(new OnClickOperators(this));
        sub.setOnClickListener(new OnClickOperators(this));
        add.setOnClickListener(new OnClickOperators(this));

        del.setOnClickListener(new OnClickClearScreen(this));

        equals.setOnClickListener(new OnClickEquals(this));


    }

    public void updateScreen() {
        screen.setText(screenUpdate);
    }

    //Operations' methods
    public double getResult() {
        String[] numbersPicked = screenUpdate.split(Pattern.quote(op));
        if (numbersPicked.length == 1) {
            return Double.parseDouble(numbersPicked[0]);
        } else {
            switch (op) {
                case "+":
                    return Double.parseDouble(numbersPicked[0]) + Double.parseDouble(numbersPicked[1]);
                case "-":
                    return Double.parseDouble(numbersPicked[0]) - Double.parseDouble(numbersPicked[1]);
                case "/":
                    return Double.parseDouble(numbersPicked[0]) / Double.parseDouble(numbersPicked[1]);
                case "*":
                    return Double.parseDouble(numbersPicked[0]) * Double.parseDouble(numbersPicked[1]);
                default:
                    return 0;
            }
        }
    }
}