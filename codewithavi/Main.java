package com.codewithavi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
//        p is total principal
        System.out.print("Principal:");
        long p = scanner.nextLong();
        // R is rate of intrest annually
        System.out.print("Interest Rate: ");
        double R = scanner.nextDouble();
        // r is intrest per month
        double r = (double) (R/12)/100;
        // N is number of years
        System.out.print("Number of years: ");
        int N = scanner.nextInt();
        // n is number of months
        int n = N * 12;
        // Now we calculate mortgage
        double Mortage = (double) ((p * r * Math.pow(1+r,n)) /(Math.pow(1+r,n) -1));
        System.out.print("So the value of Mortage is : ");
        System.out.println(Mortage);
    }
}
