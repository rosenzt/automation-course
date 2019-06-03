package Composition.Question3;

public class Wheel {

    private int location;
    private double pressure;
    private String manufacturer;
    private String name;

    public Wheel(int location) {
        this.location = location;
    }

    public Wheel(int location, double pressure, String manufacturer) {
        this.location = location;
        this.pressure = pressure;
        this.manufacturer = manufacturer;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
