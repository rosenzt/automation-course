package classes.Question1;

public class Cat {

    private int age;
    private String name;
    private String color;

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printNameAndColor() {
        System.out.println(getName() + "'s color is " + getColor() + ".");
    }
}
