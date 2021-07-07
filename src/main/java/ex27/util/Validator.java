package ex27.util;


public class Validator {

    static boolean isEmpty(String value) {
        return value == null || value.trim().length() == 0;
    }

    static boolean hasLengthOf(String value, int length) {
        return !isEmpty(value) && value.length() >= length;
    }

    static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return  false;
        }

        return true;
    }

    static boolean isLetter(String value) {
        return hasLengthOf(value, 1) && "abcdefghijklmnopqrstuvwxyz".contains(value.toLowerCase());
    }

    static boolean isLetter(char value) {
        return isLetter(value + "");
    }

    static boolean allLetters(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!isLetter(value.charAt(i))) {
                return false;
            }
        }

        return  true;
    }

    static boolean isDigit(String value) {
        return hasLengthOf(value, 1) && "0123456789".contains(value);
    }

    static boolean isDigit(char value) {
        return isDigit(value + "");
    }

    static boolean allDigits(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!isDigit(value.charAt(i))) {
                return false;
            }
        }

        return  true;
    }

    static boolean isEmployeeId(String value) {
        if (isEmpty(value)) {
            return false;
        }

        if (value.length() != 7) {
            return false;
        }

        // AA
        String letters = value.substring(0, 2);
        if (!allLetters(letters)) {
            return false;
        }

        String hyphen = value.substring(2, 3);
        if (!hyphen.equals("-")) {
            return false;
        }

        String numbers = value.substring(3);
        if (!allDigits(numbers)) {
            return false;
        }

        return true;
    }

    static String validateName(String value, String fieldName) {
        String errors = "";

        if (isEmpty(value)) {
            errors = "The " + fieldName + " must be filled in.\n";
        } else if (!hasLengthOf(value, 2)) {
            errors = "The "+ fieldName + " must be at least 2 characters long\n";
        } else if(!allLetters(value)) {
            errors = "The "+ fieldName + " only contains letters\n";
        }

        return errors;
    }

    static String validateEmployeeId(String employeeId) {
        String error = "";

        if (!isEmployeeId(employeeId)) {
            error = "The employee ID must be in the format of AA-1234\n";
        }

        return error;
    }

    static String validateZipCode(String zipCode) {
        String error = "";

        if (!isNumber(zipCode)) {
            error += "The ZIP code must be a 5 digit number\n";
        }

        return error;
    }

    public static void validateInput(String firstName, String lastName, String zipCode, String employeeId) {
        String errors = "";

        errors += validateName(firstName, "first name");
        errors += validateName(lastName, "last name");
        errors += validateZipCode(zipCode);
        errors += validateEmployeeId(employeeId);

        String result = errors.length() == 0 ? "There were no errors found." : errors;

        System.out.println(result);
    }

}

