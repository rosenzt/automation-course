package Inheritance;

import java.time.Year;

public class Person {

    private String name;
    private String email;
    private int phone;
    private int yearOfBirth;

    public Person(String name, String email, int phone, int yearOfBirth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public long getAge() {
        return Year.now().getValue() - getYearOfBirth();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }


}
