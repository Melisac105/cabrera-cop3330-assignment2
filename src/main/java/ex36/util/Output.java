package ex36.util;

import java.util.ArrayList;

public class Output {

    static public void printOutput(ArrayList<Double> numbers, double average, double min, double max, double std) {
        System.out.print("Numbers: ");

        for(Double number : numbers) {
            System.out.printf("%.0f ", number);
        }

        System.out.printf("\nThe average is: %.2f", average);
        System.out.printf("\nThe minimum is: %.2f", min);
        System.out.printf("\nThe maximum is: %.2f", max);
        System.out.printf("\nThe standard deviation is: %.2f", std);
    }
}
