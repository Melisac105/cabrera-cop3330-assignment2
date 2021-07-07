package ex31.util;

public class Processing {

    static public void calculateRate(int age, int restingRate) {

        System.out.print("Intensity | Rate\n");
        System.out.print("----------|--------\n");

        for(int i = 55; i <= 95; i+=5){
            float rate = Math.round((((220 - age) - restingRate) * i / 100) + restingRate);
            System.out.printf("%d%%\t\t  | %.0f bpm\n", i, rate);
        }
    }
}
