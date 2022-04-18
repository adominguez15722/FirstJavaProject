package com.codewithmosh;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        System.out.println(now);
        String message = "Hello world" + "!!";
        System.out.println(message.replace("!", "*"));
//        int[][] numbers = new int[2][3];
        int[][] numbers = {{1,2,3}, {4,5,6}} ;
        numbers[0][0] = 1;
//        Arrays.sort(numbers);
        System.out.println(Arrays.deepToString(numbers));
//        System.out.println(numbers.length);
        final float PI = 3.14F;
        double result = (double)10 / (double)3;
        System.out.println(result);
        int x = 1;
        x = x + 2;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        // Implicit casting
        // byte can be casted into a short aka converted
//         byte > short > int > long > float > double
        String a = "1";
        int b = Integer.parseInt(a) + 2;
        System.out.println(b);
        int roundResult = Math.round(2.2F);
        System.out.println(roundResult);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String answer = currency.format(1234567.891);
        System.out.println(answer);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte newAge = scanner.nextByte();
        System.out.println("You are " + newAge);

        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String newName = nameScanner.nextLine().trim();
        System.out.println("You are " + newName);

        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner principal = new Scanner(System.in);

        System.out.print("Principal: ");
        int principalAmount = principal.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestAmount = principal.nextFloat();
        float monthlyInterest = interestAmount / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = principal.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgageAmount = principalAmount
                                * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)
                                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        String mortgageAmountFormatted = NumberFormat.getCurrencyInstance().format(mortgageAmount);
        System.out.print("Mortgage: " + mortgageAmountFormatted);


        System.out.println(principalAmount);
    }
}
