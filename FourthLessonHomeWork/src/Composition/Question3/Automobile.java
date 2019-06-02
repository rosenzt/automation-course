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

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getRadioState() {
        if (radio.isState())
            return "On";
        else return "Off";
    }

    public void turnOnOffRadio(String state) {
        if (state.equals("On") || state.equals("on") || state.equals("ON")) {
            radio.setState(true);
            System.out.println("Radio is on.");
        } else if (state.equals("Off") || state.equals("off") || state.equals("OFF")) {
            radio.setState(false);
            System.out.println("Radio is off.");
        } else System.out.println("The state requested is not familiar");
    }

    public String getRadioStation(int i) {
        if (radio.isState()) {
//            if (i > radio.getStations().length) {
//                i = i - 1;
//            }
            return radio.getStations()[i-1].getName();
        } else return "The radio is off.";
    }

    public void getWheelsStatus() {
        for (int i = 0; i < getWheels().length; i++) {
            System.out.println("The wheel at location " + getWheels()[i].getLocation() + " has a pressure of " + getWheels()[i].getPressure() + " PSI.");
        }
    }

    public void puncher(int location) {
        getWheels()[location - 1].setPressure(0);

        if (getWheels()[4].getPressure() != 0) {
            Wheel temp = getWheels()[location - 1];
            getWheels()[location - 1] = getWheels()[4];
            getWheels()[4] = temp;
            System.out.println("The wheel has been changed.");
            getWheelsStatus();
        } else System.out.println("The spare tire has already ben used, call assistance");
    }
}
