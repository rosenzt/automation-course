package Inheritance.Question1;

public class Student extends Person {

    private String courseName;
    private boolean active;

    public Student(String name, String email, String courseName, boolean active) {
        super(name, email);
        this.courseName = courseName;
        this.active = active;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("The student is enrolled to course: " + courseName + ". The student's activation state in the course is " + active + '.');
    }
}
