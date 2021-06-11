/*
 UCF COP3330 Summer 2021 Assignment 2 Solution
 Copyright 2021 Melissa Cabrera

 Exercise 27 - Validating Inputs
 Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into
 smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.
 Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid
 according to these rules:
 - The first name must be filled in.
 - The last name must be filled in.
 - The first and last names must be at least two characters long.
 - An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
 - The ZIP code must be a number.
 Display appropriate error messages on incorrect data.

 Constraints
 - Create a function for each type of validation you need to write. Then create a validateInput function that takes in
 all of the input data and invokes the specific validation functions.
 - Use a single output statement to display the outputs.
 */

package ex27;

import ex27.util.UsrInput;
import ex27.util.Validator;

public class App {

    public static void main(String[] args) {
        String firstName = UsrInput.getString("Enter the first name: ");
        String lastName = UsrInput.getString("Enter the last name: ");
        String zipCode = UsrInput.getString("Enter the ZIP code: ");
        String employeeId = UsrInput.getString("Enter the employee ID: ");

        Validator.validateInput(firstName, lastName, zipCode, employeeId);
    }

}

