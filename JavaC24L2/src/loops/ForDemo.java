package loops;

public class ForDemo {
    public static void main(String[] args) {
       /* for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }

        for (int i =0; i<20; i+=2){
            System.out.println(i);
        }*/

        for (int i = 3; i <= 23; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }//for

        for (int i = 2; i <= 24; i += 2) {
            if (i % 2 == 0 && i > 10)
                System.out.println(i);
        }//for

    }//main
}//class
