package ex31.util;

public class Processing {

    static public int calculateRate(int age, int restingRate) {
        int rate = 0;
        for (int intensity = 55; intensity <= 95; intensity+=5) {
            rate = (((220 - age) - restingRate) * (intensity / 100)) + restingRate;
        }
        return 0;
    }
}
