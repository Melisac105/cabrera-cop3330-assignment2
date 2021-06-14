/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Melissa Cabrera

Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so you can easily spot abnormalities. For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */


package ex36;

import ex36.util.Calculations;
import ex36.util.Output;
import ex36.util.UsrInput;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> numbers = UsrInput.getNumbers();

        double average = Calculations.calculateAverage(Calculations.numbersToDouble(numbers));
        double minNumber = Calculations.calculateMin(Calculations.numbersToDouble(numbers));
        double maxNumber = Calculations.calculateMax(Calculations.numbersToDouble(numbers));
        double std = Calculations.calculateStd(Calculations.numbersToDouble(numbers));

        Output.printOutput(Calculations.numbersToDouble(numbers), average, minNumber, maxNumber, std);
    }
}
