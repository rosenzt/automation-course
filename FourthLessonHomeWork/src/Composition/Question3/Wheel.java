package Composition.Question3;

public class Wheel {

    private String name;
    private int location;
    private double pressure;
    private String manufacturer;


    public Wheel(String name, double pressure, String manufacturer) {
        this.name = name;
        this.pressure = pressure;
        this.manufacturer = manufacturer;
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

}
