package ex31.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getRestingPulse() {
            System.out.print("Resting pulse : ");
            try {
                return Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
                return -1;
            }
    }

    static public int getAge() {
        System.out.print("Age: ");
        try {
            return Integer.parseInt(input.nextLine());
        }
        catch (Exception e) {
            System.out.println("Please enter a valid input");
            return -1;
        }
    }
}
