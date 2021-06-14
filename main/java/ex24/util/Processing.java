package ex24.util;

import java.util.Arrays;

public class Processing {

    static public boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] charsWord1 = word1.toLowerCase().toCharArray();
        char[] charsWord2 = word2.toLowerCase().toCharArray();

        Arrays.sort(charsWord1);
        Arrays.sort(charsWord2);

        return Arrays.equals(charsWord1, charsWord2);
    }
}
