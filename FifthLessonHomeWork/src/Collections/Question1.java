package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {

    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<String>();

        listOfCountries.add("israel");
        listOfCountries.add("usa");
        listOfCountries.add("japan");
        listOfCountries.add("mexico");
        listOfCountries.add("australia");

        printList(listOfCountries);

        //Sorting option 1
        Collections.sort(listOfCountries);
        printList(listOfCountries);

        //sorting option2
        ArrayList<String> listOfCountries2 = new ArrayList<String>();
        listOfCountries2.add("israel");
        listOfCountries2.add("usa");
        listOfCountries2.add("japan");
        listOfCountries2.add("mexico");
        listOfCountries2.add("australia");

        printList(listOfCountries2);
        sort(listOfCountries2);
        printList(listOfCountries2);

    }//main

    public static void printList(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("==========");
    }//printList

    public static void sort(ArrayList<String> list) {
        String temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).compareToIgnoreCase(list.get(j)) < 0) { //comparing a to b gives negative result. E.g. if the strings are in descending order swap them.
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }//if
            }//for j
        }//for i
    }//sort

}//class
