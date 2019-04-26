package com.piggyBank;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Cash> piggyBank = new ArrayList<Cash>();

        piggyBank.add(new Dollar());
        piggyBank.add(new Dollar(5));

        System.out.println(piggyBank);
    }
}
