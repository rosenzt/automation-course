
public class Condition1 {

    public static void main(String[] args) {
        int option = 1;

        double num1 = 20;
        double num2 = 10;
        double sum = 0;

        if (option == 1) {
            System.out.println("add numbers");
            sum = num1 + num2;
        }

        if (option == 2) {
            System.out.println("add numbers");
            sum = num1 - num2;
        }

        if (option == 3) {
            System.out.println("add numbers");
            sum = num1 * num2;
        }

        System.out.println("Sum = " + sum);

        switch (option) {
            case 1:
                System.out.println("add numbers");
                sum = num1 + num2;
                break;
            case 2:
                System.out.println("add numbers");
                sum = num1 - num2;
                break;
            case 3:
                System.out.println("add numbers");
                sum = num1 * num2;
                break;
            default:
                break;

        }
    }
}
