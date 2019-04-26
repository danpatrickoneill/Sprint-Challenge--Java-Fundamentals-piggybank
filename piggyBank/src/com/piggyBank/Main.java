package com.piggyBank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{


    public static double checkPB(ArrayList<Cash> piggyBank)
    {
        double total = 0.0;
        for (Cash c : piggyBank)
        {
            total += c.getTotalValue();
        }
        return total;
    }

    public static void main(String[] args)
    {
        // Sets decimal format
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<Cash> piggyBank = new ArrayList<Cash>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach(c -> System.out.println(c));

        double totalValue = checkPB(piggyBank);
        System.out.println("The piggy bank holds " + fp.format(totalValue));
    }
}
