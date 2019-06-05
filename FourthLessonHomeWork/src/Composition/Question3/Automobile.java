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
            return "The radio is on.";
        else return "The radio is off.";
    }

    public void turnOnOffRadio(String state) {
        if (state.equals("On") || state.equals("on") || state.equals("ON")) {
            radio.setState(true);
            System.out.println("The radio has been turned on.");
        } else if (state.equals("Off") || state.equals("off") || state.equals("OFF")) {
            radio.setState(false);
            System.out.println("The radio has been turned off.");
        } else System.out.println("The state requested is not familiar");
    }

    public String getRadioStation(int i) {
        try {
            if (radio.isState()) {
                return radio.getStations()[i - 1].getName();
            } else return "The radio is off, please turn it on to enjoy your stations.";
        } catch (Exception e) {
            return "The station number inserted is not valid.";
        }
    }//getRadioStation

    public void getWheelsStatus() {
        for (int i = 0; i < getWheels().length; i++) {
            System.out.println("The wheel at location " + getWheels()[i].getLocation() + " has a pressure of " + getWheels()[i].getPressure() + " PSI.");
        }
    }

    public void puncher(int location) {
        try {
            getWheels()[location - 1].setPressure(0);

            if (getWheels()[4].getPressure() != 0) {
                Wheel temp = getWheels()[location - 1];
                getWheels()[location - 1] = getWheels()[4];
                getWheels()[4] = temp;
                getWheels()[4].setLocation(4);
                getWheels()[location - 1].setLocation(location - 1);

                System.out.println("The wheel has been changed.");
                getWheelsStatus();

            } else System.out.println("The spare tire has already ben used, call assistance");
        } catch (Exception e) {
            System.out.println("The wheel location selected is invalid.");
        }
    }//puncher

    public int getWheelByName(String name) {
        for (int i = 0; i < wheels.length; i++) {
            if (getWheels()[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
