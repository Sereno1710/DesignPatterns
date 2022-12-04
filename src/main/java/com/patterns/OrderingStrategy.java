package com.patterns;

import com.patterns.StringBar;
import com.patterns.StringDrink;
import com.patterns.StringRecipe;

public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
