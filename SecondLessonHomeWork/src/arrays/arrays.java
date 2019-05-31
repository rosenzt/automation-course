package arrays;

public class arrays {
    public static void main(String[] args) {

        //*****Question1******
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The number at position " + i + " is " + numbers[i]);
        }

        //*****Question2******
        String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("The at positions " + i + " is " + names[i]);
        }

        //*****Question3******
        double sum = 0;
        double[] values = {12, 10, 13.5, 4, 2};
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println("The sum is " + sum);

        //*****Question4******
        double[] minNum = {12, 10, 13.5, 4, 2};
        double min = minNum[0];
        for (int i = 0; i < values.length; i++) {
            if (minNum[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min is " + min);

        //*****Question5******
        double sum2 = 0;
        double[] findAverage = {12, 10, 13.5, 4, 2};
        for (int i = 0; i < findAverage.length; i++) {
            sum = sum + findAverage[i];
        }
        System.out.println("The average is  " + sum / findAverage.length);

        //*****Advanced - Question1******
        int[] swap = {1,2,3,4,5,6};
        printArray(swap);

        for (int i = 0; i < swap.length/2; i++) {
            int temp = swap[i];
            swap[i]=swap[(swap.length-i)-1];
            swap[(swap.length-1)-i]=temp;
        }
        printArray(swap);

        //*****Advanced - Question2 A+B******
        String[] pupilsNames = {"Name1","Name2", "Name3", "Name4, Name5"};
        int[] grades = {97,96,100,98,99};
        int location=0;
        int max = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                location=i;
            }//if
        }//for

        System.out.println("The highest grade " + max +  ", belongs to " + pupilsNames[location]);

        char[] words ={'g','o','t','o','s','l','e','e','p'};
        reverseCharArray(words);
        //*****Advanced - Question2 C******
        /***Needs to be solved on paper****/

    }//main

    private static void printArray(int[] array){
        for (int num:array) {
            System.out.println(num);
        }
    }//printArray

    private static void reverseCharArray(char[] array){
        for (int i = 0; i < array.length/2; i++) {
            char temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (char letter:array) {
            System.out.println(letter);
        }
    }


}//Class

