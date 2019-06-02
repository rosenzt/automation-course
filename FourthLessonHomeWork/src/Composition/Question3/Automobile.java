package Composition.Question3;

public class Automobile {

    private String manufacturer;
    private String model;
    private int year;

    private Wheel wheels[];
    private Radio radio;


    public Automobile(String manufacturer, String model, int year, Wheel[] wheels, Radio radio) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.radio = radio;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public boolean getRadioState(){
        return radio.isState();
    }

    public void getRadioStation(int i) {
        if (radio.isState()) {
            radio.getStations()[i].getName();
        } else System.out.println("The radio is off.");
    }

    public void getWheelsStatus(){
        for (int i = 0; i < getWheels().length; i++) {
            System.out.println("The wheel at location " + getWheels()[i].getLocation() + "has a pressure of " + getWheels()[i].getPressure() + " PSI.");
        }
    }
}
