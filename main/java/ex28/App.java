/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Melissa Cabrera

Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */


package ex28;

import ex28.util.Output;
import ex28.util.Processing;
import ex28.util.UsrInput;

public class App {

    public static void main(String[] args) {
        int num1 = UsrInput.getNumbers();
        int num2 = UsrInput.getNumbers();
        int num3 = UsrInput.getNumbers();
        int num4 = UsrInput.getNumbers();
        int num5 = UsrInput.getNumbers();
        int sum = Processing.calcSum(num1, num2, num3, num4, num5);

        Output.printOutput(sum);
    }
}
