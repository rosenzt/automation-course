package composition;

public class Engine {

    private int hp;
    private int year;
    private int numberOfCylinders;
    private boolean workingOrNot;

    public Engine(int hp, int year, int numberOfCylinders, boolean workingOrNot) {
        this.hp = hp;
        this.year = year;
        this.numberOfCylinders = numberOfCylinders;
        this.workingOrNot = workingOrNot;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isWorkingOrNot() {
        return workingOrNot;
    }

    public void setWorkingOrNot(boolean workingOrNot) {
        this.workingOrNot = workingOrNot;
    }

    @Override
    public String toString() {
        return "(hp=" + hp +
                ", year=" + year +
                ", numberOfCylinders=" + numberOfCylinders +
                ", workingOrNot=" + workingOrNot +")";
    }
}
