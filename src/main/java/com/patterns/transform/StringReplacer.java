package com.patterns.transform;

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
}
