package ex34.util;

import org.apache.commons.lang3.ArrayUtils;

public class Processing {

    static public String[] removeEmployee(String employee) {
        String[] employeesName = new String[] {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        employeesName = ArrayUtils.removeElement(employeesName, employee);
        return employeesName;
    }
}
