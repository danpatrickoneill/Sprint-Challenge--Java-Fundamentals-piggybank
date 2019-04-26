package com.piggyBank;

public class Quarter extends Cash {

    // constructor
    public Quarter()
    {
        name = "Quarter";
        value = .25;
    }
    public Quarter(int quantity)
    {
        super(quantity);
        name = "Quarter";
        value = .25;
    }

    @Override
    public String toString()
    {
            return String.format("%d %s", quantity, (quantity == 1) ? name : name + "s");
    }
}
