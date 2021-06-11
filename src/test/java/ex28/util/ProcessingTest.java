package ex28.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void calcSum() {
        int result = Processing.calcSum(1,2,3,4,5);
        assertEquals(15,result);
    }
}