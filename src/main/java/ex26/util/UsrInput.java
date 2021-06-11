package ex26.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getNumber(String question) {
        System.out.print(question);
        return input.nextDouble();
    }
}
