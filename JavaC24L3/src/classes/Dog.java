package classes;

public class Dog {

    private String type;
    private String color;
    private int age;
    private double size;

    public Dog(String type, String color, int age, double size) {
        this.type = type;
        this.color = color;
        this.age = age;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public  void printInfo(){
        System.out.println("The dogs color is " + getColor() + ".\nIts type is " + getType() + ".\n" +
                "The is age is " + getAge() + ".\nSize is " + getSize() + ".");
    }
}
