package ex40.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String getSearchString() {
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }
}
