package ex28.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void calcSum() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        assertEquals(15,Processing.calcSum(num1, num2, num3, num4, num5));
    }
}