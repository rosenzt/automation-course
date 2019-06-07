package Collections.Question2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(-3);

        System.out.println(findMax(list).toString());
        System.out.println(findMin(list).toString());

    }//main

    public static Integer findMax(ArrayList<Integer> list) {
        Integer max = list.get(0);
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static Integer findMin(ArrayList<Integer> list) {
        Integer min = list.get(0);
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }


}
