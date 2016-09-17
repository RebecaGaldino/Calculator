package com.example.rebeca.calculator.listeners;

import android.view.View;
import com.example.rebeca.calculator.MainActivity;

/**
 * Created by rebeca on 17/09/2016.
 */
public class OnClickEquals implements View.OnClickListener {
    MainActivity main;

    public OnClickEquals (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {

        main.screen.setText( String.valueOf (main.getResult()) );

    }
}
