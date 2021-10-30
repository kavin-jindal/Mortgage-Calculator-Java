package com.kavinjindal;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagenew {

    public static void main(String[] args) {

        System.out.println("Mortgage Calc by Kavin Jindal");
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        //System.out.println("Principal: " + finalprince);

        while (true){
            System.out.print("Principal [$1K - $1M]: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between $1K and $1M");


                    }

        // ask annual interest

        float ANNUAL_INTEREST = 0;
        byte MONTHS_IN_YEAR = 12;
        byte percent = 100;

        while (true){
            System.out.println("Annual Interest Rate [Between 1 and 30]: ");
            ANNUAL_INTEREST = scanner.nextFloat();
            if (ANNUAL_INTEREST >= 1 && ANNUAL_INTEREST <= 30)
                break;
            System.out.println("The value should be between 1 and 30");
        }
        float FINAL_INTEREST = ANNUAL_INTEREST / percent / MONTHS_IN_YEAR;

        //System.out.println("Final Interest Rate: " + finalint);


        byte years = 0;
        while (true){
            System.out.println("Enter the period in years [Between 1 and 30]: ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("The value should be between 1 and 30");

        }
        int calculate = years * 12;
        double mortgage_final = principal * (FINAL_INTEREST * Math.pow(1 + FINAL_INTEREST, years)) / (Math.pow(1 + FINAL_INTEREST, years) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currency_mortgage = currency.format(mortgage_final);
        System.out.println("Final Mortgage: " + currency_mortgage);






    }
}
