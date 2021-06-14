package ex34.util;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {

    @Test
    void removeEmployee() {
        String[] employeesName = new String[] {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] finalEmployeesName = ArrayUtils.removeElement(employeesName, "Chris Jones");


//        assertArray(employeesName, finalEmployeesName);
    }
}