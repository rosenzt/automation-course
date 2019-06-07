package Composition.Question2;

public class Goat {

    private String name;
    private double age;
    private String gender;
    private String color;
    private double weight;

    private Beard beard;
    private Tail tail;
    private LegOrHind legOrHind;

    public Goat(String name, double age, String gender, String color, double weight, Beard beard, Tail tail, LegOrHind legOrHind) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.beard = beard;
        this.tail = tail;
        this.legOrHind = legOrHind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LegOrHind getLegOrHind() {
        return legOrHind;
    }

    public void setLegOrHind(LegOrHind legOrHind) {
        this.legOrHind = legOrHind;
    }

    public void getGoatInfo() {
        System.out.println(
                getName() + "'s information is as follows:\n" +
                        "------------------------------------\n" +
                        getName() + "'s age is " + getAge() + " years, it is a " + getGender() + ".\n" +
                        "It's color is " + getColor() + " and its weight is " + getWeight() + " kg.\n" +
                        "It has " + legOrHind.howManyLegs() + " legs.\n" +
                        beard.getBeardInfo() + "\n" +
                        tail.getTailInfo() + "\n" +
                        "*** End of " + getName() + "'s information ***"

        );
    }//printInfo
}
