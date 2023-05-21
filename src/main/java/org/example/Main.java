package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Testing different cases-
        int result1 = calculator.add("");           // Empty string

        // Print the results
        System.out.println("Result 1: " + result1); // Expected output: 0
    }
}