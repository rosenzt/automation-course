package loopAndConditions;

public class loopAndConditionsBasic {
    public static void main(String[] args) {

        /*Question 1*/
        System.out.println("*Question 1*");
        int i = 0;
        while (i <= 99) {
            System.out.println(i);
            i++;
        }//while

        /*Question 2*/
        System.out.println("*Question 2*");
        for (int j = 1; j <= 99; j++) {
            System.out.println(j);
        }//for

        /*Question 3*/
        System.out.println("*Question 3*");
        int k = 2;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 22);

    }//main
}//class
