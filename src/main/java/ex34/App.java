/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Melissa Cabrera

Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

Constraint
Use an array or list to store the names.
 */


package ex34;

import ex34.util.Output;
import ex34.util.Processing;
import ex34.util.UsrInput;

public class App {

    public static void main(String[] args) {
        String employeeName = UsrInput.getEmployeeName();
        String[] finalEmployeesList = Processing.removeEmployee(employeeName);

        Output.printOutput(finalEmployeesList);
    }

}
