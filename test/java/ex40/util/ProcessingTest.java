package ex40.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void search() {
        String query = "Jac";
        List<Processing.Data> expectedResults = Processing.search(query);

        assertEquals(2, expectedResults.size());
        assertEquals("Jake Jacobson", expectedResults.get(0).name());
        assertEquals("Jacquelyn Jackson", expectedResults.get(1).name());

        String query2 = "NoResults";
        List<Processing.Data> expectedNoResults = Processing.search(query2);
        assertEquals(0, expectedNoResults.size());
    }
}