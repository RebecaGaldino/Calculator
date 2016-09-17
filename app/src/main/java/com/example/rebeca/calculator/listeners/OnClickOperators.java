package com.example.rebeca.calculator.listeners;

import android.view.View;
import android.widget.Button;
import com.example.rebeca.calculator.MainActivity;

/**
 * Created by rebeca on 17/09/2016.
 */
public class OnClickOperators implements View.OnClickListener{
    MainActivity main;

    public OnClickOperators (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) v;

        if(main.op.equals("")){
            main.screenUpdate += btn.getText();
            main.op = (String) btn.getText();
            main.updateScreen();

        } else {
            main.screenUpdate = String.valueOf(main.getResult()) + btn.getText();
            main.op = (String) btn.getText();
            main.updateScreen();
        }

    }
}
