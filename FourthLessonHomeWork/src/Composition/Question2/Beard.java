package Composition.Question2;

public class Beard {

    private boolean hasOrNot;
    private String color;
    private double length;

    public Beard(boolean hasOrNot) {
        this.hasOrNot = hasOrNot;
    }

    public Beard(boolean hasOrNot, String color, double length) {
        this.hasOrNot = hasOrNot;
        this.color = color;
        this.length = length;
    }

    public boolean isHasOrNot() {
        return hasOrNot;
    }

    public void setHasOrNot(boolean hasOrNot) {
        this.hasOrNot = hasOrNot;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getBeardInfo() {
        if (isHasOrNot()) {
            return "The beard is " + getLength() + " cm long, and its color is " + getColor() + ".";
        } else {
            return "The goat has no beard.";
        }
    }//info
}

