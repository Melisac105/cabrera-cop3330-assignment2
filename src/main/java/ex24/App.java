/*
 * UCF COP3330 Summer 2021 Assignment 2 Solution
 * Copyright 2021 Melissa Cabrera
 *
 * Exercise 24 - Anagram Checker
 * Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.
 *
 * Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt
 * for both input strings and display the output as shown in the example that follows.
 *
 * Constraints
 * Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true
 * or false. Invoke this function from your main program.
 * Check that both words are the same length.
 */

package ex24;

import ex24.util.Output;
import ex24.util.Processing;
import ex24.util.UsrInput;

public class App {

    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String word1 = UsrInput.getWord("Enter the first string: ");
        String word2 = UsrInput.getWord("Enter the second string: ");

        boolean isAnagram = Processing.isAnagram(word1, word2);
        Output.printResult(isAnagram, word1, word2);
    }
}
