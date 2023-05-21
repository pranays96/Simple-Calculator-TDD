package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Testing different cases-
        int result1 = calculator.add("");           // Empty string
        int result2 = calculator.add("1");          // Single number
        int result3 = calculator.add("2,3");        // Two numbers separated by comma
        int result4 = calculator.add("1\n2,3");     // New lines between numbers
        int result5 = calculator.add("//;\n1;2");   // Custom delimiter


        // Print the results
        System.out.println("Result 1: " + result1); // Expected output: 0
        System.out.println("Result 2: " + result2); // Expected output: 1
        System.out.println("Result 3: " + result3); // Expected output: 3
        System.out.println("Result 4: " + result4); // Expected output: 6
        System.out.println("Result 5: " + result5); // Expected output: 3
    }
}