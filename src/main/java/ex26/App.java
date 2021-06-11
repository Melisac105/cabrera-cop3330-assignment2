/*
  UCF COP3330 Summer 2021 Assignment 2 Solution
  Copyright 2021 Melissa Cabrera

 Exercise 26 - Months to Pay Off a Credit Card
 It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring
 that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.
 Write a program that will help you determine how many months it will take to pay off a credit card balance.
 The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
 The program should then return the number of months needed (rounded up to the next integer value).
 The formula for this is
 n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
 where
 n is the number of months.
 i is the daily rate (APR divided by 365). b is the balance.
 p is the monthly payment.

 Constraints
 - Prompt for the card’s APR. Do the division internally.
 - Prompt for the APR as a percentage, not a decimal.
 - Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
 which returns the number of months.
 - Round fractions of a cent up to the next cent.
 */

package ex26;

import ex26.util.Output;
import ex26.util.PaymentCalculator;
import ex26.util.UsrInput;

public class App {

    public static void main(String[] args) {
        double balance = UsrInput.getNumber("What is your balance? ");
        double aprPercent = UsrInput.getNumber("What is the APR on the card (as a percent) ");
        double monthlyPayment = UsrInput.getNumber("What is the monthly payment you can make? ");

        int n = PaymentCalculator.calculateMonthsUntilPaidOff(balance, aprPercent, monthlyPayment);
        Output.printResult(n);
    }

}

