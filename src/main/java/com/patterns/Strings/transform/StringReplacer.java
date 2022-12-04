package com.patterns.Strings.transform;

import com.patterns.StringDrink;

public class StringReplacer implements StringTransformer{


        private char c;
        private char r;

        public StringReplacer(char character, char replacement) {
            this.c = character;
            this.r = replacement;
        }


        @Override
        public void execute(StringDrink drink) {
            String i = drink.getText().replace(c, r);
            drink.setText(i);
        }
    @Override
    public void undo(StringDrink drink) {
        String i = drink.getText().replace(r, c);
        drink.setText(i);
    }
}
