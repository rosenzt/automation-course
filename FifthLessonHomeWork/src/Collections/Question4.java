package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question4 {
    public static void main(String[] args) {

        int[] data = {100,30,20,40,5,25,71,89,80,19};
        printList(createListFromArray(data));

    } //main

    public static ArrayList createListFromArray(int[] array){

        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i :array) {
            list.add(i);
        }
        return list;
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer s : list) {
            System.out.println(s);
        }
        System.out.println("==========");
    }//printList

}
