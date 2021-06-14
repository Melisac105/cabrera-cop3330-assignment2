package ex40.util;

import java.util.*;

public class Processing {

    public static class Data {
        private String firstName;
        private String lastName;
        public String position;
        public String separationDate;

        public Data(String firstName, String lastName, String position, String separationDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;

            if (separationDate == null) {
                this.separationDate = "";
            } else {
                this.separationDate = separationDate;
            }
        }

        public boolean search(String term) {
            return this.firstName.contains(term) || this.lastName.contains(term);
        }

        public String name() {
            return firstName + " " + lastName;
        }
    }

    public static Map<Integer, Data> DATA = Map.of(
            1, new Data("John", "Johnson","Manager", "2016-12-31"),
            2, new Data("Tou", "Xiong","Software Engineer", "2016-10-05"),
            3, new Data("Michaela", "Michaelson","District Manager", "2015-12-19"),
            4, new Data("Jake", "Jacobson","Programmer", null),
            5, new Data("Jacquelyn", "Jackson","DBA", null),
            6, new Data("Sally", "Webber","Web Developer", "2015-12-18")
    );

    public static List<Data> search(String searchString) {
        List<Data> results = new ArrayList<>();

        for (Data temp : DATA.values()) {
            if (temp.search(searchString)) {
                results.add(temp);
            }
        }

        return results;
    }

}
