package composition;

public class MyCars {

    public static void main(String[] args) {
        Engine engine = new Engine(500, 2018, 8, false);

        Car lexus = new Car("Lexus", 250354, 2019, "White", engine);
        Car toyota = new Car("Toyota", 120000, 2018, "White", engine);

        //lexus.start();
        System.out.println(lexus.toString());

    }
}
