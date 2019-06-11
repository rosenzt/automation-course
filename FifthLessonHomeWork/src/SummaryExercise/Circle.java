package SummaryExercise;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + ".\n";
    }

    public double calcCircumferences(){
        return 2*(Math.PI*radius);
    }

    public double calcArea(){
        return  Math.PI*(Math.pow(radius,2));
    }
}
