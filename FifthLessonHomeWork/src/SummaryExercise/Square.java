package SummaryExercise;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Square: width = " + width + ".\n";
    }

    public double calcCircumferences() {
        return width * 4;
    }

    public double calcArea() {
        return Math.pow(width, 2);
    }
}
