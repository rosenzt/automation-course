package SummaryExercise;

public class RightTriangle extends Shape {

    private double height;
    private double width;

    public RightTriangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Right Triangle: height = " + height + ", width = " + width + ".\n";
    }

    public double calcCircumferences() {
        return width + height + Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
    }

    public double calcArea() {
        return (height * width) / 2;
    }
}
