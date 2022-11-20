package com.patterns.transform;

import com.patterns.StringDrink;
import com.patterns.transform.StringTransformer;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink){
            String i= new StringBuilder(drink.getText()).reverse().toString();
            /*String invert="";
            for(int i = drink.getText().length()-1;i >= 0;i--){
                Character aux= drink.getText().charAt(i);
                invert+= aux;
            }*/ // slowest way
            drink.setText(i);
    }
    @Override
    public void undo(StringDrink drink){
        String i= new StringBuilder(drink.getText()).reverse().toString();
            /*String invert="";
            for(int i = drink.getText().length()-1;i >= 0;i--){
                Character aux= drink.getText().charAt(i);
                invert+= aux;
            }*/ // slowest way
        drink.setText(i);
    }
}

