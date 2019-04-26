package com.piggyBank;

public class Dime extends Cash {

    // constructor
    public Dime()
    {
        name = "Dime";
        value = .10;
    }
    public Dime(int quantity)
    {
        super(quantity);
        name = "Dime";
        value = .10;
    }
}
