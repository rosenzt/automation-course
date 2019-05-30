package Question2;

public class Goat {

    private double age;
    private String gender;
    private String color;
    private double weight;

    private Beard beard;
    private Tail tail;

    public Goat(double age, String gender, String color, double weight, Beard beard, Tail tail) {
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.beard = beard;
        this.tail = tail;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Beard getBeard() {
        return beard;
    }

    public void setBeard(Beard beard) {
        this.beard = beard;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }
}
