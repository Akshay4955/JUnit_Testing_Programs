package com.bridgelabz.junit_programs;

import java.util.Scanner;

public class Util {
    public static void main(String[] args) {

        getDay();
        getConvertedTemperature();
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
