package com.kavinjindal;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mortgage Calc by Kavin Jindal");
        System.out.print("Enter your principal amount: ");
        Scanner scanner = new Scanner(System.in);
        int finalprince = scanner.nextInt();
        //System.out.println("Principal: " + finalprince);

        // ask annual interest
        System.out.print("Enter your annual interest rate: ");

        float anint = scanner.nextFloat();
        byte monthsinyear = 12;
        byte percent = 100;

        float finalint = anint / percent / monthsinyear;
        //System.out.println("Final Interest Rate: " + finalint);

        System.out.print("Period (years)");
        byte years = scanner.nextByte();
        int calculate = years * 12;
        //System.out.println("Number of months, you will be paying: " + calculate);

        double mortgage_final = finalprince * (finalint * Math.pow(1 + finalint, years))
                / (Math.pow(1 + finalint, years) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currency_mortgage = currency.format(mortgage_final);
        //System.out.println("Your mortgage: " + mortgage_final);
        System.out.println("Final Mortgage: " + currency_mortgage);






    }

}
