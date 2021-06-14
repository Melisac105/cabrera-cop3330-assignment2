/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Melissa Cabrera

Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */


package ex37;

import ex37.util.UsrInput;

public class App {
    int length = UsrInput.getLength();
    int specialChar = UsrInput.getSpecialChar();
    int numbers = UsrInput.getNumbers();


}
