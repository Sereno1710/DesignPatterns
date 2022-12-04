package com.patterns.Strings.transform;

import com.patterns.StringDrink;

public class StringCaseChanger implements  StringTransformer {
    @Override
    public void execute(StringDrink drink){
        String change="";
        for (int i= 0; i< drink.getText().length();i++){
            char j= drink.getText().charAt(i);
            if ( !Character.isLowerCase(j))
            change +=  Character.toLowerCase(j);
            else change += Character.toUpperCase(j);
        }
    drink.setText(change);
    }
    @Override
    public void undo(StringDrink drink){
        String change="";
        for (int i= 0; i< drink.getText().length();i++){
            char j= drink.getText().charAt(i);
            if ( !Character.isLowerCase(j))
                change +=  Character.toLowerCase(j);
            else change += Character.toUpperCase(j);
        }
        drink.setText(change);
    }

}
