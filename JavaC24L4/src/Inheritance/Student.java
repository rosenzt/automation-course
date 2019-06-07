package Inheritance;

public class Student extends Person {

    private double avgGrade;

    public Student(String name, String email, int phone, int yearOfBirth, double avgGrade) {
        super(name, email, phone, yearOfBirth);
        this.avgGrade = avgGrade;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent{" +
                "avgGrade=" + avgGrade +
                '}';
    }
}
