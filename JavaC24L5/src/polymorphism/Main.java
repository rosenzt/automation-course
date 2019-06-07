package polymorphism;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("red", 3);
        Rectangle rectangle = new Rectangle("blue", 4, 5);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());

        Shape[] shapes = new Shape[6];
        shapes[0] = new Rectangle("blue", 4, 5);
        shapes[1] = new Circle("red", 3);

        double sum = 0;
        for (Shape s : shapes) {
            sum += s.calcArea();
        }

        System.out.println("Total area: " + sum);

        ArrayList<Shape> alist=new ArrayList<Shape>();
        alist.add(new Circle("green",4.6));
        alist.add(new Rectangle("white", 20,20));

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i).calcArea());
        }
    }
}
