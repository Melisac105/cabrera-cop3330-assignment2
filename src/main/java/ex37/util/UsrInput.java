package ex37.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getLength() {
        System.out.print("What's the minimum length? ");
        return Integer.parseInt(input.nextLine());
    }

    static public int getSpecialChar() {
        System.out.print("How many special characters? ");
        return Integer.parseInt(input.nextLine());
    }

    static public int getNumbers() {
        System.out.print("How many numbers? ");
        return Integer.parseInt(input.nextLine());
    }
}
