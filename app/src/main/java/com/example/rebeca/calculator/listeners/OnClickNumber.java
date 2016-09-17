package com.example.rebeca.calculator.listeners;

import android.view.View;
import android.widget.Button;
import com.example.rebeca.calculator.MainActivity;
/**
 * Created by rebeca on 17/09/2016.
 */
public class OnClickNumber implements View.OnClickListener {
    MainActivity main;

    public OnClickNumber(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) v;
        main.screenUpdate += btn.getText();
        main.updateScreen();
    }
}
