package SummaryExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        ArrayList<Shape> shapes = new ArrayList<>();

        do {
            presentMenu();
            switch (choice) {
                case 1:
                    addNewShape(shapes);
                case 2:
                    listAllShapes(shapes);
                case 3:
                    sumAllCircumferences(shapes);
                case 4:
                    sumAllArea(shapes);
                case 5:
                    findBiggestCircumference(shapes);
            }//switch case
        } while (choice != 7);

    }//main

    public static void presentMenu() {
        System.out.println(
                "1. Add a new shape.\n" +
                        "2. List all shapes.\n" +
                        "3. Sum all circumferences.\n" +
                        "4. Sum all areas.\n" +
                        "5. Find biggest circumference.\n" +
                        "6. Find biggest area.\n" +
                        "7. Exit");

    }

    public static void addNewShape(ArrayList<Shape> list) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        System.out.println("Please choose which shape to add:\n " +
                "1. Square\n" +
                "2. Rectangle\n" +
                "3. Circle\n" +
                "4. Right triangle\n");

        switch (shape) {
            case "Square":
                System.out.println("Please enter the square's width.");
                double width = scanner.nextInt();
                Square square = new Square(width);
                list.add(square);
                break;
            case "Rectangle":
                System.out.println("Please enter the rectangle's height.");
                double reaHeight = scanner.nextInt();
                System.out.println("Please enter the rectangle's length.");
                double reqLength = scanner.nextInt();
                Rectangle rectangle = new Rectangle(reaHeight, reqLength);
                list.add(rectangle);
                break;
            case "Circle":
                System.out.println("Please enter the circles's radius.");
                double radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                list.add(circle);
                break;
            case "Right triangle":
                System.out.println("Please enter the triangle's height.");
                double triHeight = scanner.nextInt();
                System.out.println("Please enter the triangle's length.");
                double triWidth = scanner.nextInt();
                RightTriangle triangle = new RightTriangle(triWidth, triHeight);
                list.add(triangle);
                break;
            default:
                System.out.println("The input provided is invalid.");
        }//Switch-case
    }//addNewShape

    public static void listAllShapes(ArrayList<Shape> list) {
        for (Shape s : list) {
            System.out.println(s.toString());
        }
    }//listAllShapes

    public static void sumAllCircumferences(ArrayList<Shape> list) {
        double sum = 0;
        for (Shape s : list) {
            sum = +s.calcCircumferences();
        }
        System.out.println(sum);
    }

    public static void sumAllArea(ArrayList<Shape> list) {
        double sum = 0;
        for (Shape s : list) {
            sum = +s.calcArea();
        }
        System.out.println("The total area is " + sum);
    }

    public static void findBiggestCircumference(ArrayList<Shape> list) {
        Shape biggestShape = new Shape();
        double max = 0;
        for (Shape s : list) {
            if (s.calcCircumferences() > max) {
                max = s.calcCircumferences();
                biggestShape = s;
            }//if
        }//for
        System.out.println(biggestShape.toString() + "\nThe circumference is " + max);
    }//findBiggestCircumference


} //class

