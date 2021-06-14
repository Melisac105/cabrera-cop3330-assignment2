package ex36.util;

import java.util.ArrayList;
import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public ArrayList<String> getNumbers() {
        ArrayList<String> numbers = new ArrayList<>();
        while(true) {
            System.out.print("Enter a number: ");
            numbers.add(input.nextLine());
            if(numbers.contains("done")) {
                numbers.remove("done");
                numbers.remove("");
                break;
            }
        }
        return numbers;
    }
}
