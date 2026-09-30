public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 1");
        // 1. Create two int variables named "numberOne" and "numberTwo". Give the variable "numberOne" a value of 10
        //    and the "numberTwo" a value of 2.
        //    Create four other variables called "sum" (+), "difference" (-), "product" (*) and "quotient" (/).
        //    Calculate the results of the four calculations above and print them to the console.

        int numberOne = 10;
        int numberTwo = 2;

        int sum, difference, product, quotient;

        sum = numberOne + numberTwo;        //12
        difference = numberOne - numberTwo; //8
        product = numberOne * numberTwo;    //20
        quotient = numberOne / numberTwo;   //5

        System.out.println(sum);            //12
        System.out.println(difference);     //8
        System.out.println(product);        //20
        System.out.println(quotient);       //5
        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Exercise 2");
        // 2. Try to calculate the modulo-tasks below in your head before you check it.

        int moduloTask1 = 10 % 5;           //0
        int moduloTask2 = 10 % 2;           //0
        int moduloTask3 = 49 % -7;          //0
        int moduloTask4 = 100 % 3;          //1
        int moduloTask5 = -13 % 1;          //0
        int moduloTask6 = 13 % 6;           //1
        int moduloTask7 = 22 % -13;         //9

        System.out.println(moduloTask1);    //0
        System.out.println(moduloTask2);    //0
        System.out.println(moduloTask3);    //0
        System.out.println(moduloTask4);    //1
        System.out.println(moduloTask5);    //0
        System.out.println(moduloTask6);    //1
        System.out.println(moduloTask7);    //9

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 3");
        // 3. Change the assignment operator so, that you are not using the variable name twice.

        // Do not change this line
        String thisIsAVeryLongStringNameAndItIsAnnoyingToRead = "Con";

        // Change the assignment operator here
        thisIsAVeryLongStringNameAndItIsAnnoyingToRead += "grats!";

        // Do not change this line
        System.out.println(thisIsAVeryLongStringNameAndItIsAnnoyingToRead);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 4");
        // 4. Same as Exercise 3, but with * instead of a +.

        // Do not change this line
        int multiplication = 5;

        // Change the assignment operator here
        multiplication *= 2;

        // Do not change this line
        System.out.println(multiplication);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 5");
        // 5. Now the other way around! Change the assignment operator so, that
        //    you are using two times the variable name on the same line.

        // Do not change this line
        int subtraction = 100;

        // Change the assignment operator here
        subtraction = subtraction / 4;

        // Do not change this line
        System.out.println(subtraction);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 6");
        // 6. Replace the following lines with the shorter version using the
        //    assignment operators

        // Do not change this line
        int a = 5, b = 10;

        // Change the assignment operators here
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 7");
        // 7. Try to explain why the results below are as shown in the comment
        int postfixPlus = 10;
        System.out.println(postfixPlus++); // 10
        System.out.println(postfixPlus);   // 11
        // First System.out.println: Prints the value, THEN +1 (After printing it)
        // Second System.out.println: Now it has the value 11, which wasn't printed before

        int postfixMinus = 10;
        System.out.println(postfixMinus--); // 10
        System.out.println(postfixMinus);   // 09
        // First System.out.println: Prints the value, THEN -1 (After printing it)
        // Second System.out.println: Now it has the value 09, which wasn't printed before

        int prefixPlus = 5;
        System.out.println(++prefixPlus); // 6
        System.out.println(prefixPlus);   // 6
        // First System.out.println: First adds +1, then prints the number
        // Second System.out.println: Prints the number with its value 6

        int prefixMinus = 5;
        System.out.println(--prefixMinus); // 4
        System.out.println(prefixMinus);   // 4
        // First System.out.println: First adds -1, then prints the number
        // Second System.out.println: Prints the number with its value 4

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 8");
        // 8. Change the values of the booleans with the "logical not"-operator

        // Use the "logical not"-operator to print out "false" instead of "true"
        System.out.println(!true);

        // Use the "logical not"-operator to print out "true" instead of "false"
        boolean shouldBeTrue = !false;
        System.out.println(shouldBeTrue);

        //  What is the difference between these 2 lines
        boolean testBoolean1 = !false;
        System.out.println(testBoolean1);
        // and these 2 lines?
        boolean testBoolean2 = false;
        System.out.println(!testBoolean2);

        // In the first example (testBoolean1), we actually change the value of the boolean,
        // whereas in the second example (testBoolean2) we are just changing the printing message.
        // We are NOT changing the testBoolean2. testBoolean2 is still false!
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 9");
        // 9. Can you explain the result below?

        int maxInt = Integer.MAX_VALUE; // 2147483647
        int minInt = Integer.MIN_VALUE; // -2147483648

        //Why does it go from a positive value to a negative value?
        System.out.println("Max int test:");
        System.out.println(maxInt);
        maxInt++;
        System.out.println(maxInt);

        //Why does it go from a negative value to a positive value?
        System.out.println("Min int test:");
        System.out.println(minInt);
        minInt--;
        System.out.println(minInt);

        // It is based of the implementation in binary.
        // You can think of a ring, where MAX_VALUE is connected to MIN_VALUE
        // Or in a simpler example, lets say we can go from -2 to 2
        // Then: -2, -1, 0, 1, 2    And now it goes back to -2, -1 etc...
        // Same happens with the other direction of course.
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 10");
        // 10. Try to figure out without checking what the value is. After that, check your answer by printing it out.
        //     Was the answer unexpected?

        int i = 10;
        int result = i++ % 5;
        // What is the value of "i" and "result" after executing the code?
        // i = 11
        // result = 0
        System.out.println("Value of i: " + i);
        System.out.println("Value of result: " + result);


        result = ++i % 5;
        // What is the value of "i" and "result" after executing the code?
        // i = 12
        // result = 2
        System.out.println("Value of i: " + i);
        System.out.println("Value of result: " + result);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 11");
        // 11. We know that we can concatenate Strings with the "+"-operator as the code below shows.

        String concatenateMe = "This is a";
        concatenateMe += " concatenation!";
        System.out.println(concatenateMe);

        //     What happens, if instead of using the "+"-operator, you use the "-"-operator?

        //     It will throw an error: "bad operand types for binary operator "-"
        //     first type: String
        //     second type: String

        //     Java doesn't have an implementation for the "-"-operator for Strings
        //     therefore, it throws an error.

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 12");
        // 12. By using parentheses, you can affect the order of operations.
        //     Everything inside in parentheses are performed before outside of them.
        //     Write in comments the exact steps down.
        //     Example:
        //     int example = 1 + 3 * 4 + (1 + 2);
        //                   1 + 3 * 4 + 3
        //                   1 + 12    + 3
        //                   16

        int calculationWithParentheses = (2 + 2) + 5 * (3 + 2);
        // (2 + 2) + 5 * (3 + 2);
        //    4    + 5 *    5
        //    4    + 25
        //    29
        System.out.println(calculationWithParentheses);

        int calculationWithoutParentheses = 2 + 2 + 5 * 3 + 2;
        // 2 + 2 + 5 * 3 + 2;
        // 2 + 2 + 15    + 2
        // 21
        System.out.println(calculationWithoutParentheses);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 13");
        // 13. Division all again! Check the code below.
        //     Calculate the answer in your head and write it down in the comment.
        //     Now check what the "resultQuotient" in the System.out.println is printing.
        //     Is this the correct answer?
        //     Can you explain why this is happening?

        int dividend = 10;
        int divisor = 3;

        // What is the expected answer?
        // Expected Answer: 3.33333....
        int resultQuotient = dividend / divisor;
        System.out.println(resultQuotient);

        // Explanation of the value of "resultQuotient":
        // We are dividing with integers, which are whole numbers.
        // If there are cases like this, where we need floating point numbers, Java will simply cut off the rest.
        // Therefor, the result is 3.

        // How could you fix it?
        // Use float instead of int

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 14");

        // In 2014, the song "Gangnam style" "broke" youtube by showing a negative view count:
        // -2142871897 (depending on the time, it was either higher or lower)
        // Try to explain why that happened
        // Try to mimic it so, that it will show
        // Do not change the 'System.out.println(viewCount)'-lines

        int viewCount = Integer.MAX_VALUE;
        System.out.println(viewCount); // Should show: 2_147_483_647
        viewCount += 1;
        System.out.println(viewCount); // Should show: -2_147_483_648 (underscore for readability)
        viewCount += 200;
        System.out.println(viewCount); // Should show: -2_147_483_448 (underscore for readability)


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 15");
        // 14. OPTIONAL:
        //    Try to figure out what is going on with the next few lines of code.
        //    Can you explain exactly at which point which value "x" has?

        int x = 1;
        x = x++ + ++x;
        System.out.println(x); // Why is the solution 4?

        // x++ + ++x;
        //  1  +  3

        // First, it takes the value of x(1) and AFTER THAT it increases its value by 1.
        // The value of x is now 2.
        // Now we are adding ++x. However, before this happens, we increase the value of X by one.
        // X was 2, increasing it by one = 3.
        // And then we add the previous result(1) with the last result(3) together.

    }
}