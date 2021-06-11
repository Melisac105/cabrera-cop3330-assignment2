package ex32.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getDifficultyLevel() {
        System.out.println("Let's play Guess the Number!");
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        try {
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("Please enter a valid input");
            return -1;
        }
    }
}

