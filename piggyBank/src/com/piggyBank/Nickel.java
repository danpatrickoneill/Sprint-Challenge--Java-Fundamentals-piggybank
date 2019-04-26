package com.piggyBank;

public class Nickel extends Cash {

    // constructor
    public Nickel()
    {
        name = "Nickel";
        value = .05;
    }
    public Nickel(int quantity)
    {
        super(quantity);
        name = "Nickel";
        value = .05;
    }
}
