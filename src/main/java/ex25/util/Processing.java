package ex25.util;

public class Processing {

    static final char[] LETTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static final char[] NUMBERS = "0123456789".toCharArray();
    static final char[] SPECIAL_CHARS = "!@#$%ˆ&*()-_+=".toCharArray();

    static boolean containsSymbols(String password, char[] dictionary, int min) {
        int sum = 0;

        for (int i = 0; i < dictionary.length; i++) {
            String letter = dictionary[i] + "";
            if (password.contains(letter)) {
                sum++;
            }
        }

        return sum >= min;
    }

    static boolean isVeryWeakPassword(String password) {
        boolean onlyContainsNumbers = Processing.containsSymbols(password, NUMBERS, password.length());
        return password.length() < 8 && onlyContainsNumbers;
    }

    static boolean isWeakPassword(String password) {
        boolean onlyContainsLetters = Processing.containsSymbols(password, LETTERS, password.length());
        return password.length() < 8 && onlyContainsLetters;
    }

    static boolean isStrongPassword(String password) {
        boolean containsNumbers = Processing.containsSymbols(password, NUMBERS, 1);
        boolean containsLetters = Processing.containsSymbols(password, LETTERS, 2);
        return password.length() >= 8 && containsNumbers && containsLetters;
    }

    static boolean isVeryStrongPassword(String password) {
        boolean containsNumbers = Processing.containsSymbols(password, NUMBERS, 2);
        boolean containsLetters = Processing.containsSymbols(password, LETTERS, 2);
        boolean containsSpecialChars = Processing.containsSymbols(password, SPECIAL_CHARS, 1);
        return password.length() >= 8 && containsNumbers && containsLetters && containsSpecialChars;
    }

    static public int passwordValidator(String password) {
        if (isVeryStrongPassword(password)) {
            return 4;
        } else if (isStrongPassword(password)) {
            return 3;
        } else if (isWeakPassword(password)) {
            return 2;
        } else {
            return 1;
        }
    }
}
