package classes.Question1;

import classes.Question1.Cat;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(3, "Snoopi", "black");
        Cat cat2 = new Cat(4, "Mitzi", "white");

        cat1.printNameAndColor();
        cat2.printNameAndColor();

    }

}
