package com.piggyBank;

public class Dollar extends Cash {

    // constructor
    public Dollar()
    {
        name = "$";
        value = 1.0;
    }
    public Dollar(int quantity)
    {
        super(quantity);
        name = "$";
        value = 1.0;
    }

    @Override
    public String toString() {
        return name + quantity;
    }
}
