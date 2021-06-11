package ex32.util;

import java.util.Random;
import java.util.Scanner;

public class Processing {
    static Scanner input = new Scanner(System.in);

    static public int guessNumber(int gameLevel) {
        Random rand = new Random();
        int consoleNumber;
        int usrNumber;

        if (gameLevel == 1) {
            int level1MaxNumber = 11;
            consoleNumber = rand.nextInt(level1MaxNumber);
            System.out.print("I have my number. What's your guess? ");
            usrNumber = Integer.parseInt(input.nextLine());
//            System.out.println(rand.nextInt(level1MaxNumber));
        }
        if (gameLevel == 2) {
            int level2MaxNumber = 101;
            consoleNumber = rand.nextInt(level2MaxNumber);
            System.out.print("I have my number. What's your guess? ");
            usrNumber = Integer.parseInt(input.nextLine());
//            System.out.println(rand.nextInt(level2MaxNumber));
        }
        if (gameLevel == 3) {
            int level3MaxNumber = 1001;
            consoleNumber = rand.nextInt(level3MaxNumber);
            System.out.print("I have my number. What's your guess? ");
            usrNumber = Integer.parseInt(input.nextLine());
//            System.out.println(rand.nextInt(level3MaxNumber));
        }
        return 0;
    }
}
