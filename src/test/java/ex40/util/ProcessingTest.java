package ex40.util;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void search() {
        String query = "Jac";
        List<Processing.Data> expectedResults = Processing.search(query);

        List<String> expectedNames = Arrays.asList("Jacquelyn Jackson", "Jake Jacobson");
        List<String> names = Arrays.asList(expectedResults.get(0).name, expectedResults.get(1).name);

        assertEquals(2, expectedResults.size());
        assertTrue(expectedNames.containsAll(names) && names.containsAll(expectedNames));

        String query2 = "NoResults";
        List<Processing.Data> expectedNoResults = Processing.search(query2);
        assertEquals(0, expectedNoResults.size());
    }
}