package Inheritance.Question1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("student1", "studnet1@student1.com", "students1Course", true);
        Student student2 = new Student("student2", "studnet2@student2.com", "students2Course", false);
        Student student3 = new Student("student3", "studnet3@student3.com", "students3Course", true);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }

}
