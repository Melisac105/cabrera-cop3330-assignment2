package ex34.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String getEmployeeName() {
        System.out.print("There are 5 employees:\nJohn Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin\n");
        System.out.print("\nEnter an employee name to remove: ");
        return input.nextLine();
    }
}
