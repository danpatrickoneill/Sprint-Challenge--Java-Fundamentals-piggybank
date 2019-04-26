package com.piggyBank;

public abstract class Cash
{
    // fields
    int quantity;
    double value;
    String name;

    // constructor
    public Cash()
    {
        quantity = 1;
    }

    public Cash(int quantity)
    {
        this.quantity = quantity;
    }

    // methods
    public double getTotalValue()
    {
        return value * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString()
    {
        return quantity + " " + name;
    }
}
