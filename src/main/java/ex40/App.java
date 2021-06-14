/*
 UCF COP3330 Summer 2021 Assignment 2 Solution
 Copyright 2021 Melissa Cabrera

 Exercise 40 - Filtering Records
 Sorting records is helpful, but sometimes you need to filter down the results to find or display only what
 you’re looking for.
 Given the following data set create a program that lets a user locate all records that match the search string
 by comparing the search string to the first or last name field.

 Constraint
 - Implement the data using an array of maps or an associative array.
 */

package ex40;

import ex40.util.Output;
import ex40.util.Processing;

import java.util.List;

import static ex40.util.UsrInput.getSearchString;

public class App {
    public static void main(String[] args) {
        String searchString = getSearchString();
        List<Processing.Data> results = Processing.search(searchString);
        Output.printResults(results);
    }
}
