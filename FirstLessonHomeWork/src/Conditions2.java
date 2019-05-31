public class Conditions2 {
    public static void main(String[] args) {

        int age = 18;

        if (age < 18) {
            System.out.println("Person is a minor.");
        } else if (age > 66) {
            System.out.println("Person is a senior citizen");
        } else if (age == 18) {
            System.out.println("Person's age is exactly 18.");
        } else {
            System.out.println("Person is mature.");
        }
    }
}
