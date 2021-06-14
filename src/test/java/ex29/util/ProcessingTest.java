package ex29.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void calculateYears() {

        assertEquals(18, Processing.calculateYears(4));
    }
}