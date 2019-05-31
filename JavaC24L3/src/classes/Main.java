package classes;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Name1", 22, 98, "mail@mail.mail");
        Student student2 = new Student("Name2", 23, 99, "mail1@mail.mail");
        Student student3 = new Student("Name3", 24, 100, "mail2@mail.mail");

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("type1", "black", 2, 5.5);
        dogs[1] = new Dog("type2", "white", 3, 6.6);
        dogs[2] = new Dog("type3", "Ginger", 4, 7.7);

        printDogsArray(dogs);
    }

    private static void printDogsArray(Dog[] dogs){
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printInfo();
        }
    }
}
