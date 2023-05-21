# Simple-Calculator-TDD
To create a Simple String Calculator using TDD.
# TDD Exercise
## Purpose
Learn to use Test Driven Development to create a program.

### Steps-
1. Create a String calculator with a method int Add(string numbers)
    1. The method can take 0, 1, or 2 numbers and will return their sum.
    2. An empty string will return 0.
2. Allow the Add method to handle an unknown amount of numbers.
3. Allow the Add method to handle new lines between numbers (instead of commas).
   1. The following input is ok: "1\n2,3" (will equal 6)
   2. The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)
4. Support different delimiters
   1. To change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"
   2. The first line is optional. all existing scenarios should still be supported.
5. Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.
 
   

