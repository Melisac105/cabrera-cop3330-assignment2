package ex30.util;

public class Output {

    static public void createTable() {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println("");
        }
    }
}
