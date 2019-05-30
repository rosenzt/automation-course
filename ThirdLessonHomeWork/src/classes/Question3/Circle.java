package classes.Question3;

public class Circle {

    private int area;
    private String color;

    public Circle(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("The circles area is " + getArea() + "\nIts color is " + getColor() + ".");
    }
}
