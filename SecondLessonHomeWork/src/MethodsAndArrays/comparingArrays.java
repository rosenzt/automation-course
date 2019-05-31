package MethodsAndArrays;

import java.util.Arrays;

public class comparingArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {6, 5, 4, 3, 2, 1};
        System.out.println(equals(array1, array2));

    }//main

    public static boolean equals(int[] array1, int[] array2) {
        int[] arr1 = sortArray(array1);
        int[] arr2 = sortArray(array2);

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (!(arr1[i] == arr2[i])) {
                    return false;
                }//if
            }//for
            return true;
        }//outer if
        else return false;

    }

    public static int[] sortArray(int[] arr) {

        int marker, i, temp;
        marker = 0;
        i = 1;

        while (marker < arr.length - 1) {
            if (i == arr.length) {
                marker++;
                i = marker;
            }//if

            if (arr[marker] > arr[i]) {
                temp = arr[marker];
                arr[marker] = arr[i];
                arr[i] = temp;
            }//if

            i++;
        }//while

        return arr;
    }//sortArray

}//class
