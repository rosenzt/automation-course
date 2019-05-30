package classes.Medium;

public class Circle {

    String color;
    double radius;

    public Circle(String color) {
        this.color = color;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return  Math.PI*(Math.pow(radius,2));
    }

    public void printInfo(){
        System.out.println("The circle's area is " + calculateArea() + "\nIts color is " + getColor() + ".");
    }
}
