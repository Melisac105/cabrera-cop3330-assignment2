package ex25.util;

import java.util.Scanner;

public class UsrInput {

    static Scanner input = new Scanner(System.in);

    static public String getWord(String question) {
        System.out.print(question);
        return input.nextLine();
    }
}
