package com.piggyBank;

public class Penny extends Cash {

    // constructor
    public Penny()
    {
        name = "Penny";
        value = .01;
    }
    public Penny(int quantity)
    {
        super(quantity);
        name = "Penny";
        value = .01;
    }
}
