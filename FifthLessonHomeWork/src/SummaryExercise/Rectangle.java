package SummaryExercise;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", length = " + length + '.';
    }

    public double calcCircumferences(){
        return (width*2)+(length*2);
    }

    public double calcArea(){
        return  width*length;
    }
}
