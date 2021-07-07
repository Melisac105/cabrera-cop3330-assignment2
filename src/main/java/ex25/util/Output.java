package ex25.util;

public class Output {

    static public void printResult(int passwordComplexity, String password) {
        String complexity = "";
        if (passwordComplexity == 4) {
            complexity = "very strong";
        } else if (passwordComplexity == 3) {
            complexity = "strong";
        } else if (passwordComplexity == 2) {
            complexity = "weak";
        } else if (passwordComplexity == 1) {
            complexity = "very weak";
        }

        String response = "The password '"  + password +  "' is " + complexity + " password.";
        System.out.println(response);
    }
}

