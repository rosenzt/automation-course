package classes.Question2;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat(2,"Snoopi", "black");
        cats[1] = new Cat(3,"Mitzi", "white");
        cats[2] = new Cat(4,"SuSu", "Ginger");
        cats[3] = new Cat(5,"frunlek", "Brown");
        cats[4] = new Cat(6,"Garfield", "Musica");

        printCatsInfo(cats);



    }

    public static void printCatsInfo(Cat[] cats){

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }
    }

}
