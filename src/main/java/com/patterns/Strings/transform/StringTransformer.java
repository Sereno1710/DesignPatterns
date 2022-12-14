package com.patterns.Strings.transform;

import com.patterns.StringDrink;

public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
