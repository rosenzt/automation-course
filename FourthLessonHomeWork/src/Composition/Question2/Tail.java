package Composition.Question2;

public class Tail {

    private boolean hasOrNot;
    private double length;
    private String color;

    public Tail(boolean hasOrNot) {
        this.hasOrNot = hasOrNot;
    }

    public Tail(boolean hasOrNot, double length, String color) {
        this.hasOrNot = hasOrNot;
        this.length = length;
        this.color = color;
    }

    public boolean isHasOrNot() {
        return hasOrNot;
    }

    public void setHasOrNot(boolean hasOrNot) {
        this.hasOrNot = hasOrNot;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTailInfo() {
        if (isHasOrNot()) {
            return "The tail is " + getLength() + " cm long " + "and " + getColor() + ".";
        } else {
            return "The goat has no tail.";
        }
    }
}
