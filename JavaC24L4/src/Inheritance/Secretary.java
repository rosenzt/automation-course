package Inheritance;

public class Secretary extends Person {

    private int sosPhone;

    public Secretary(String name, String email, int phone, int yearOfBirth, int sosPhone) {
        super(name, email, phone, yearOfBirth);
        this.sosPhone = sosPhone;
    }

    public int getSosPhone() {
        return sosPhone;
    }

    public void setSosPhone(int sosPhone) {
        this.sosPhone = sosPhone;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSecretary{" +
                "sosPhone=" + sosPhone +
                '}';
    }
}
