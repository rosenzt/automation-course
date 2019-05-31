package loopAndConditions;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (checkIfNumIsPrime(i)) {
                System.out.println(i);
            }
        }


    }//main

    public static boolean checkIfNumIsPrime(int num) {

        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }//for
        return true;
    }


}//class
