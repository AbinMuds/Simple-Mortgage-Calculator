package com.codewithavi;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //constants
        final byte monthsInYears = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/ monthsInYears / Percent;

        System.out.print("Period In Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYears;

        // Now we calculate mortgage
        double Mortage = (double) ((principal * monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayments)) /(Math.pow(1+monthlyInterest,numberOfPayments) -1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
