package ex34.util;


public class Output {

    static public void printOutput(String[] employeesList) {
        System.out.println("There are 4 employees:");
        for (String s : employeesList) {
            System.out.println(s);
        }
    }
}
