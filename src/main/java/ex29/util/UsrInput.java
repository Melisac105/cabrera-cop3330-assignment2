package ex29.util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getRate() {
        try {
            System.out.print("What is the rate of return? " );
            int rate = Integer.parseInt(input.nextLine());
            if(rate == 0) {
                System.out.println("Sorry. That's not a valid input");
                return -1;
            }
            return rate;
        }catch (Exception e) {
            System.out.println("Sorry. That's not a valid input");
            return -1;
        }
    }

}
