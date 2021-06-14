package ex35.util;


import java.util.ArrayList;
import java.util.Random;

public class Processing {

    static public String findWinner(ArrayList<String> names) {
        Random rand = new Random();
        return names.get(rand.nextInt(names.size()));
    }
}
