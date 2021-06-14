package ex36.util;


import java.util.ArrayList;

public class Calculations {

    static public ArrayList<Double> numbersToDouble(ArrayList<String> numbers) {
        ArrayList<Double> numbersDouble = new ArrayList<>();
        for(String number : numbers) {
            numbersDouble.add(Double.parseDouble(number));
        }
        return numbersDouble;
    }

    static public double calculateAverage(ArrayList<Double> numbers) {

        double sum = 0;

        for(Double s : numbers) {
            sum = sum + s;
        }
        return sum / numbers.size();
    }

    static public double calculateMin(ArrayList<Double> numbers) {

        double min = numbers.get(0);

        for(double number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    static public double calculateMax(ArrayList<Double> numbers) {
        double max = numbers.get(0);

        for(double number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    static public double calculateStd(ArrayList<Double> numbers) {
        double sum = 0, standardDeviation = 0;
        double average;

        for(double number : numbers) {
            sum = sum + number;
        }
        average = sum / numbers.size();
        for(double num: numbers) {
            standardDeviation += Math.pow(num - average, 2);
        }
        return Math.sqrt(standardDeviation / numbers.size());
    }
}
