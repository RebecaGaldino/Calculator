package com.example.rebeca.calculator.listeners;

import android.view.View;

import com.example.rebeca.calculator.MainActivity;

/**
 * Created by rebeca on 17/09/2016.
 */
public class OnClickClearScreen implements View.OnClickListener {
    MainActivity main;

    public OnClickClearScreen(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        main.screenUpdate = "";
        main.op = "";
        main.updateScreen();

    }
}
