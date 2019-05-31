package loopAndConditions;

import java.util.Scanner;

public class loopAndConditionsMedium {
    public static void main(String[] args) {

        //******Question1******
        Scanner s = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number.");
        double age = s.nextDouble(); // Read user input


        while (age != -1) {

            System.out.println("Your age is " + age);
            age = s.nextDouble();

        }//while
        System.out.println("Thank you and good bye.");

        //******Question2******
        Scanner q = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number.");
        double ageSecondQuestion = q.nextDouble(); // Read user input


        while (ageSecondQuestion != -1) {
            if (ageSecondQuestion < 18) {
                System.out.println("Your are a minor.");
            } else if (ageSecondQuestion > 66) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are mature.");
            }
            ageSecondQuestion = q.nextDouble();

        }//while
        System.out.println("Thank you and good bye.");

        //******Question3******
        Scanner v = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number.");
        double everOrOdd = v.nextDouble(); // Read user input

        while (everOrOdd != -1) {
            if (everOrOdd % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            everOrOdd = v.nextDouble();
        }//while

        //******Question4******

        for (int j = 10; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }//for

        //******Question5******
        Scanner i = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a number.");
        double numberMultiplication = i.nextDouble(); // Read user input

        while (numberMultiplication != 0) {
            double result = Math.pow(numberMultiplication,2);
            if (result > 30) {
                System.out.println("The result is " + result);
                System.out.println("Please re-enter a number.");
            }
            numberMultiplication = i.nextDouble();
            System.out.println("The result is smaller than 30, please re-enter a number.");
        }//while
        System.out.println("Thank you and good bye.");

    }//main
}//class
