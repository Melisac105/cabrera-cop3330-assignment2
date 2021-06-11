/*
 UCF COP3330 Summer 2021 Assignment 2 Solution
 Copyright 2021 Melissa Cabrera

 Exercise 25 - Password Strength Indicator
 Functions help you abstract away complex operations, but they also help you build reusable components.
 Create a program that determines the complexity of a given password based on these rules:
 - A very weak password contains only numbers and is fewer than eight characters.
 - A weak password contains only letters and is fewer than eight characters.
 - A strong password contains letters and at least one number and is at least eight characters.
 - A very strong password contains letters, numbers, and special characters and is at least eight characters.
 Constraints
 - Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate
 to determine the password strength. Do not have the function return a string—you may need to support multiple
 languages in the future.
 - Use a single output statement.
 */

package ex25;

import ex25.util.Output;
import ex25.util.UsrInput;
import ex25.util.Processing;

public class App {

    public static void main(String[] args) {
        String password = UsrInput.getWord("Enter the password: ");
        int passwordComplexity = Processing.passwordValidator(password);
        Output.printResult(passwordComplexity, password);
    }
}
