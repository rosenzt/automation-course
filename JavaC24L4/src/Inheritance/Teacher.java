package Inheritance;

public class Teacher extends Person {

    private double parkingPlace;

    public Teacher(String name, String email, int phone, int yearOfBirth, double parkingPlace) {
        super(name, email, phone, yearOfBirth);
        this.parkingPlace = parkingPlace;
    }

    public double getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(double parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTeacher{" +
                "parkingPlace=" + parkingPlace +
                '}';
    }
}
