# Simple-Calculator-TDD
To create a Simple String Calculator using TDD(Test Driven Development).
# TDD Exercise
## Purpose
Learn to use Test Driven Development to create a program.

### Steps-
1. Create a String calculator: int Add(string numbers)
    * Handles 0, 1, or 2 numbers and returns their sum.
    * Empty string input returns 0.
2. Allow the unknown amount of numbers.
3. Handle new lines between numbers (instead of commas).
    * Example: "1\n2,3" returns 6.
    * "1,\n" is invalid.
4. Support different delimiters.
    * Use the "//[delimiter]\n[numbers...]" format to change delimiter.
    * Example: "//;\n1;2" returns 3 (default delimiter is ";").
5. Negative numbers throw the "Negatives not allowed" exception.
    * The exception includes the negative value passed.
 
   

