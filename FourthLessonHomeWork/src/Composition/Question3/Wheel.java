package Composition.Question3;

public class Wheel {

    private String location;
    private double pressure;
    private String manufacturer;

    public Wheel(String location, double pressure, String manufacturer) {
        this.location = location;
        this.pressure = pressure;
        this.manufacturer = manufacturer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
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
}
