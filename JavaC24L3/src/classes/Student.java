package classes;

public class Student {

    private String name;
    private int age;
    private int grade;
    private String email;

    public Student() {
    }

    public Student(String name, int age, int grade, String email) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
