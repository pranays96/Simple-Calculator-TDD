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
                delimiter = numbers.substring(2, numbers.indexOf("\n"));
                numbers = numbers.substring(numbers.indexOf("\n") + 1);
            }
            String[] numberArray = numbers.split("[" + delimiter + "\n]");
            int sum = 0;
            List<Integer> negatives = new ArrayList<>();
            for (String number : numberArray) {
                int num = Integer.parseInt(number);
                if (num < 0) {
                    negatives.add(num);
                }
                sum += num;
            }
            if (!negatives.isEmpty()) {
                throw new IllegalArgumentException("Negatives are not allowed: " + negatives);
            }
            return sum;
        }
    }
}
