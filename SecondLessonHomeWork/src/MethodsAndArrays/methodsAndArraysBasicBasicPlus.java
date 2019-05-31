package MethodsAndArrays;

public class methodsAndArraysBasicBasicPlus {

    public static void main(String[] args) {

        printYourName();
        printYourName("My name.");
        System.out.println(calcValue(5));
        System.out.println(findMin(4, 8, 1));
        int[] ints = {8,2,5,1,6,7,9,3,9,2};
        System.out.println(findMinInArray(ints));
        System.out.println(searchValue(1, ints));
    }//main

    public static void printYourName() {
        System.out.println("Your name.");
    }//printYourName

    public static void printYourName(String myName) {
        System.out.println(myName);
    }//printYourName

    public static int calcValue(int myValue) {
        return (myValue + 5);
    }//calcValue

    public static int findMin(int num1, int num2, int num3) {

        if (num1 > num2) {
            if (num2 > num3) {
                return num3;
            } else return num2;
        } else if (num1 > num3) {
            return num3;
        } else return num1;
    }//findMin

    public static int findMinInArray(int[] array) {
        if (array.length != 10) {
            return 0; /***What do I return here ??***/
        }
        int min = array[0];
        for (int i : array) {
            if (array[i] < min) {
                min = array[i];
            }//if
        }//for
        return min;
    }

    public static boolean searchValue(int myValue, int[] array1){
        if (array1.length != 10) {
            return false; /***What do I return here ??***/
        }
        for (int i : array1) {
            if (array1[i] == myValue) {
                return true;
            }//if
        }//for
        return false;
    }
}//class
