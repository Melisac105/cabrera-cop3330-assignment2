package ex28.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getNumbers() {
        for(int i = 0; i < 1; i++) {
            System.out.print("Enter a number: ");
        }
        return input.nextInt();
    }
}
