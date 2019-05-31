package loopAndConditions;

import java.util.Scanner;

public class browserColors {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter a browser name (starting with a capital letter).");
        String browser = s.next(); // Read user input

        switch (browser){
            case ("Firefox"):
                System.out.println("Blue");
                break;
            case("Chrome"):
                System.out.println("Red");
                break;
            case("Internet Explorer"):
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Green");
                break;
        }//switch

    }//main
}//class
