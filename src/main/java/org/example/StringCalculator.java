package org.example;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";
            if (numbers.startsWith("//")) {
                delimiter = numbers.substring(2, numbers.indexOf("\n"));
                numbers = numbers.substring(numbers.indexOf("\n") + 1);
            }
            String[] numberArray = numbers.split("[" + delimiter + "\n]");
            int sum = 0;
            for (String number : numberArray) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
    }
}
