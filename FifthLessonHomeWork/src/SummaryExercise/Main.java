package SummaryExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        int choice;
        try {
            do {
                presentMenu();
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addNewShape(shapes);
                        break;
                    case 2:
                        listAllShapes(shapes);
                        break;
                    case 3:
                        sumAllCircumferences(shapes);
                        break;
                    case 4:
                        sumAllArea(shapes);
                        break;
                    case 5:
                        findBiggestCircumference(shapes);
                        break;
                    case 6:
                        findBiggestArea(shapes);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("The choice entered is invalid.");
                }//switch case
            } while (choice != 7);
            System.out.println("Thank you, good bye.");
        } catch (Exception e) {
            System.out.println("Invalid input, please try again.");
        }

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

        System.out.println("Please choose which shape to add:\n" +
                "1. Square\n" +
                "2. Rectangle\n" +
                "3. Circle\n" +
                "4. Right triangle");

        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        switch (shape) {
            case "Square":
                System.out.println("Please enter the square's width.");
                double width = scanner.nextDouble();
                Square square = new Square(width);
                list.add(square);
                System.out.println("Square added, thank you.\n");
                break;
            case "Rectangle":
                System.out.println("Please enter the rectangle's height.");
                double reaHeight = scanner.nextDouble();
                System.out.println("Please enter the rectangle's length.");
                double reqLength = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(reaHeight, reqLength);
                list.add(rectangle);
                System.out.println("Rectangle added, thank you.\n");
                break;
            case "Circle":
                System.out.println("Please enter the circles's radius.");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                list.add(circle);
                System.out.println("Circle added, thank you.\n");
                break;
            case "Right triangle":
                System.out.println("Please enter the triangle's height.");
                double triHeight = scanner.nextDouble();
                System.out.println("Please enter the triangle's length.");
                double triWidth = scanner.nextDouble();
                RightTriangle triangle = new RightTriangle(triWidth, triHeight);
                list.add(triangle);
                System.out.println("Triangle added, thank you.\n");
                break;
            default:
                System.out.println("The input provided is invalid.\n");
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
        System.out.println("The total circumferences is " + sum + "\n");
    }

    public static void sumAllArea(ArrayList<Shape> list) {
        double sum = 0;
        for (Shape s : list) {
            sum = +s.calcArea();
        }
        System.out.println("The total area is " + sum + "\n");
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
        System.out.println(biggestShape.toString() + "\nThe circumference is " + max + "\n");
    }//findBiggestCircumference

    public static void findBiggestArea(ArrayList<Shape> list) {
        Shape biggestShape = new Shape();
        double max = 0;
        for (Shape s : list) {
            if (s.calcArea() > max) {
                max = s.calcArea();
                biggestShape = s;
            }//if
        }//for
        System.out.println(biggestShape.toString() + "\nThe area is " + max + "\n");
    }//findBiggestCircumference

} //class

