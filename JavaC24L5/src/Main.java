public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("red", 3);
        Rectangle rectangle= new Rectangle("blue", 4,5);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());

    }
}
