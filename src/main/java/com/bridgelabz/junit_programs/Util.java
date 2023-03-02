package com.bridgelabz.junit_programs;

import java.util.Scanner;

public class Util {
    public static void main(String[] args) {

        getDay();
        getConvertedTemperature();
        calculateMonthlyPayment();
        getSquareRoot();
    }

    static void getSquareRoot() {
        System.out.println("Enter the no to find square root");
        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        double t = c;
        double l = 0.000000000000001;
        double root;

        while (true) {
            root = 0.5 * (t + c / t);
            if (Math.abs(root - t) < l)
                break;
            t = root;
        }
        System.out.println("Root is equal to " + root);
    }

    static void calculateMonthlyPayment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle loan amount");
        int P = input.nextInt();
        System.out.println("Enter years to pay off");
        int Y = input.nextInt();
        System.out.println("Enter percentage of interest rate");
        double R = input.nextDouble();
        double r = R / 12 * 100;
        int n = 12 * Y;
        double monthlyPayment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        System.out.println("Monthly Payment is " + monthlyPayment);
    }

    static void getConvertedTemperature() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter option 1 for Celsius to Fahrenheit and 2 for Fahrenheit to Celsius ");
        int option = input.nextInt();
        System.out.println("Enter the temperature: ");
        int temperature = input.nextInt();
        switch (option) {
            case 1 :
                System.out.println("Celsius to Fahrenheit is equal to: " + ((temperature * 9 / 5) + 32));
                break;
            case 2:
                System.out.println("Fahrenheit to Celsius is equal to: " + (temperature - 32) * 5 / 9);
                break;
        }
    }

    static void getDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of week");
        System.out.println("Enter the Day: ");
        int d = input.nextInt();
        System.out.println("Enter the Month ((1 for jan, 2 for feb likewise) :");
        int m = input.nextInt();
        System.out.println("Enter the Year: ");
        int y = input.nextInt();
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
