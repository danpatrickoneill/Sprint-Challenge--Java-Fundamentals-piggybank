package com.piggyBank;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

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

    public static String removeCash(ArrayList<Cash> piggyBank, Cash c, int quantity)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        int remainingQuantity = quantity;
        for (Cash cash : piggyBank)
        {
            if (remainingQuantity > 0)
            {
                if (cash.getName().equals(c.getName()))
                {
                    if (cash.getQuantity() >= remainingQuantity)
                    {
                        cash.setQuantity(cash.getQuantity() - quantity);
                        remainingQuantity -= quantity;
                    }
                }
            }
        }
        return "The piggy bank holds " + fp.format(checkPB(piggyBank));
    }

    // Functional HashMap removal function
    //public static void removeCash(HashMap<String, Integer> piggyBank, Cash c, Integer quantity)
    //{
    //    if (!piggyBank.containsKey(c.getName()))
    //    {
    //        System.out.println("Currency not found");
    //    }
    //    else
    //    {
    //        if (quantity > piggyBank.get(c.getName()))
    //        {
    //            System.out.println("You don't have enough " +  c.getName() + "s");
    //        }
    //        else
    //        {
    //            piggyBank.replace(c.getName(), piggyBank.get(c.getName()) - quantity);
    //        }
    //    }
    //}

    //Non-functional HashMap removal function
    //public static void removeCash(HashMap<Cash, Integer> piggyBank, Cash c, Integer quantity)
    //{
    //    if (!piggyBank.containsKey(c))
    //    {
    //        System.out.println("Currency not found");
    //    }
    //    else
    //    {
    //        if (quantity > piggyBank.get(c))
    //        {
    //            System.out.println("You don't have enough " +  c.getName() + "s");
    //        }
    //        else
    //        {
    //            piggyBank.replace(c, piggyBank.get(c.getName()) - quantity);
    //        }
    //    }
    //}

    // DOESN'T WORK
    //public static ArrayList<Cash> convertPB (HashMap<Cash, Integer> piggyBank)
    //{
    //    ArrayList<Cash> pb = new ArrayList<Cash>();
    //
    //    for (HashMap.Entry<Cash, Integer> entry : piggyBank.entrySet())
    //    {
    //        System.out.println(entry.getKey());
    //
    //    }
    //    return pb;
    //}

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

        //DEVELOPMENT ON HOLD
        //HashMap<Cash, Integer> piggyHash = new HashMap<Cash, Integer>();
        //
        //for (Cash c : piggyBank)
        //{
        //    if (piggyHash.containsKey(c))
        //    {
        //        // Add cash value to existing value
        //        piggyHash.replace(c, piggyHash.get(c) + c.getQuantity());
        //    }
        //    else
        //    {
        //        // Initialize cash type as key and cash value as value
        //        piggyHash.put(c, c.getQuantity());
        //    }
        //}

        // HashMap<String, Integer> piggyHash = new HashMap<String, Integer>();
        //
        // for (Cash c : piggyBank)
        // {
        //     if (piggyHash.containsKey(c.getName()))
        //     {
        //         // Add cash value to existing value
        //         piggyHash.replace(c.getName(), piggyHash.get(c.getName()) + c.getQuantity());
        //     }
        //     else
        //     {
        //         // Initialize cash type as key and cash value as value
        //         piggyHash.put(c.getName(), c.getQuantity());
        //     }
        // }
        //
        // System.out.println(piggyHash.toString());
        // removeCash(piggyHash, new Dollar(), 8);
        // System.out.println(piggyHash.toString());

        System.out.println(piggyBank);
        System.out.println(removeCash(piggyBank, new Nickel(), 3));
        System.out.println(piggyBank);


    }
}
