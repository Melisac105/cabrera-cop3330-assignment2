package ex24.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void isAnagram() {

        String word1 = "hello";
        String word2 = "lleho";
        String word3 = "food";
        String word4 = "hosu";

        assertTrue(Processing.isAnagram(word1, word2));
        assertFalse(Processing.isAnagram(word3, word4));
    }
}