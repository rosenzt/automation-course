package Collections.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<String>();

        listOfCountries.add("israel");
        listOfCountries.add("usa");
        listOfCountries.add("japan");
        listOfCountries.add("mexico");
        listOfCountries.add("australia");

        for (String s : listOfCountries) {
            System.out.println(s);
        }

        Collections.sort(listOfCountries);
    }

}
