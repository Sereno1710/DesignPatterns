package com.patterns.Clients;

import com.patterns.BarObserver;
import com.patterns.StringBar;
import com.patterns.StringDrink;
import com.patterns.StringRecipe;

interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
