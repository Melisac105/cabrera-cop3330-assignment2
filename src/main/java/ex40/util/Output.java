package ex40.util;

import java.util.List;

public class Output {

    static public void printResults(List<Processing.Data> results) {
        String leftAlignFormat = "%-25s | %-15s | %-15s %n";
        String separator = "--------------------------|-----------------|-----------------";

        System.out.println("Results: ");

        System.out.println(separator);
        System.out.format(leftAlignFormat, "Name", "Position", "Separation Date");
        System.out.println(separator);

        for (Processing.Data temp : results) {
            System.out.format(leftAlignFormat, temp.name(), temp.position, temp.separationDate);
        }

        System.out.println(separator);
    }
}
