package Inheritance;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Teacher", "teacher@teacher.com", 123456789, 1985, 5.4);
        Student student = new Student("Student", "student@student.com", 987654321, 2000, 94.5);
        Secretary secretary = new Secretary("Secretary", "secretary@secretary.com", 123454321, 1995, 1800800800);

        System.out.println(teacher.getAge() + "\n" + student.getAge() + "\n" + secretary.getAge());
        //System.out.println(teacher.toString() + "\n" + student.toString() + "\n" + secretary.toString());

    }
}
