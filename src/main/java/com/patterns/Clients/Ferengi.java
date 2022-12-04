package com.patterns.Clients;

import com.patterns.*;
import com.patterns.strategy.SmartStrategy;

public class Ferengi implements Client{
    private OrderingStrategy strategy;
    public Ferengi() {
        this.strategy = new SmartStrategy();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar)
            strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourStarted((StringBar) bar);
        }
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

}
