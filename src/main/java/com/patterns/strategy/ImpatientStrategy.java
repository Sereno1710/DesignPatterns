package com.patterns.strategy;

import com.patterns.OrderingStrategy;
import com.patterns.StringBar;
import com.patterns.StringDrink;
import com.patterns.StringRecipe;

public class ImpatientStrategy implements OrderingStrategy {

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }
    @Override
    public void happyHourStarted(StringBar bar) {
    }
    @Override
    public void happyHourEnded(StringBar bar) {
    }
}