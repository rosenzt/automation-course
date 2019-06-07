package Composition.Question2;

public class Main {
    public static void main(String[] args) {

        Beard shortBeard = new Beard(true, "White", 15);
        Tail shortTail = new Tail(true, 10.0, "White");

        Beard noBeard = new Beard(false);
        Tail noTail = new Tail(false);

        boolean[] initLegs = {true, true, true, true};
        LegOrHind legs = new LegOrHind(initLegs);

        Goat goat = new Goat("Goaty", 1.5, "Male", "White", 34.8, shortBeard, shortTail, legs);
        Goat goat2 = new Goat("Goatush", 7, "female", "Black", 25, noBeard, noTail, legs);

        goat.getGoatInfo();
        goat2.getGoatInfo();
    }
}
