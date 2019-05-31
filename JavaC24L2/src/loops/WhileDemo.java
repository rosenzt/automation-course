package loops;

import java.util.Scanner;

public class WhileDemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number.");
        long number = s.nextLong(); // Read user input
        long sum = 0;

        while (number != -1) {
            System.out.println(number);
            System.out.println("Please enter a number.");
            number = s.nextLong();

            if (number > 500) {
                break;
            }
            sum = sum + number;
        }//while

        System.out.println("sum = " + sum);
        System.out.println("End.");

    }//main
}//class
