package Inheritance.Question2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.howDoYouLive();
        Anaconda anaconda = new Anaconda();
        anaconda.howDoYouLive();

        Gorilla gorilla = new Gorilla();

        animal.howManyLegs();
        anaconda.howManyLegs();
        gorilla.howManyLegs();

        Anole anole = new Anole();
        anole.howManyLegs();


    }
}
