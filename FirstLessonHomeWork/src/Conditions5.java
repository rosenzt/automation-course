import java.util.Scanner;

public class Conditions5 {
    public static void main(String[] args) {

        System.out.println("Hello, \nPlease enter a number.");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        } else {
            System.out.println("The number " + num + " is odd.");
        }

    }
}
