package ex35.util;


import java.util.ArrayList;
import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        do {
            System.out.print("Enter a name: ");
            names.add(input.nextLine());
        } while (!names.contains(""));
        return names;
    }
}
