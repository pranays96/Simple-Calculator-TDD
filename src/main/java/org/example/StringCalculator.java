package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";
            if (numbers.startsWith("//")) {
                delimiter = extractDelimiter(numbers);
                numbers = removeDelimiterDefinition(numbers);
            }
            String[] numberArray = splitNumbers(numbers, delimiter);
            int sum = calculateSum(numberArray);
            checkForNegativeNumbers(numberArray);
            return sum;
        }
    }

    private String extractDelimiter(String numbers) {
        return numbers.substring(2, numbers.indexOf("\n"));
    }

    private String removeDelimiterDefinition(String numbers) {
        return numbers.substring(numbers.indexOf("\n") + 1);
    }

    private String[] splitNumbers(String numbers, String delimiter) {
        return numbers.split("[" + delimiter + "\n]");
    }

    private int calculateSum(String[] numberArray) {
        int sum = 0;
        for (String number : numberArray) {
            int num = Integer.parseInt(number);
            sum += num;
        }
        return sum;
    }

    private void checkForNegativeNumbers(String[] numberArray) {
        List<Integer> negatives = new ArrayList<>();
        for (String number : numberArray) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                negatives.add(num);
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives are not allowed: " + negatives);
        }
    }
}
