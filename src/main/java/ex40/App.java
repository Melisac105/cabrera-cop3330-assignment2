package ex40;

import ex40.util.Output;
import ex40.util.Processing;

import java.util.List;

import static ex40.util.UsrInput.getSearchString;

public class App {
    public static void main(String[] args) {
        String searchString = getSearchString();
        List<Processing.Data> results = Processing.search(searchString);
        Output.printResults(results);
    }
}
