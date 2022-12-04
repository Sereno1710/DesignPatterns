package com.patterns;

import com.patterns.Strings.transform.StringTransformer;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink stringDrink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(stringDrink);
        }
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.undo(drink);
        }
    }
}
