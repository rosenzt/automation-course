package MethodsAndArrays;

import java.util.Scanner;

public class questionTwoUserInputCalculations {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number");
        int number = s.nextInt(); // Read user input

        double max = 0;
        double min = 0;
        double sum = 0;
        int counter = 1;

        while (number != -1) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
            sum = sum + number;
            counter++;
            number = s.nextInt();
        }//while

        System.out.println("The highest value inserted is " + max +
                ".\nThe lowest value inserted is " + min +
                ".\nThe sum of all values inserted is " + sum +
                "\nThe average of all values inserted is " + (sum / counter));


    }
}
