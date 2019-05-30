package classes.Medium;

public class Rectangle {

    private String color;
    private double height;
    private double width;

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle(String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double calculateArea(){
        return  getHeight()*getWidth();
    }

    public void printInfo(){
        System.out.println("The rectangle's area is " + calculateArea() + "\nIts color is " + getColor() + ".");
    }
}
