package Composition.Question3;

public class Main {

    public static void main(String[] args) {

        Station station1 = new Station("Galgalatz", 98.1);
        Station station2 = new Station("Galatz", 96.6);
        Station station3 = new Station("Kan 88", 88);
        Station station4 = new Station("eco 99", 99);
        Station station5 = new Station("Kan 88", 88);
        Station station6 = new Station("Radius 100 FM", 100);

        Station[] stations = {station1, station2, station3, station4, station5, station6};
        Radio radio = new Radio(true, stations);

        Wheel frontRight = new Wheel("Front right", 30, "Goodyear");
        Wheel frontLeft = new Wheel("Front left", 30, "Goodyear");
        Wheel rearRight = new Wheel("Rear right", 30, "Goodyear");
        Wheel rearLeft = new Wheel("Rear left", 30, "Goodyear");
        Wheel spare = new Wheel("Spare", 30, "Goodyear");

        Wheel[] wheels = {frontRight, frontLeft, rearRight, rearLeft, spare};

        Automobile myCar = new Automobile("Toyota", "Corolla", 2011, wheels, radio);

        System.out.println(myCar.getRadioState());
        System.out.println(myCar.getRadioStation(1));
        myCar.turnOnOffRadio("on");

        System.out.println(myCar.getRadioStation(-1));
        System.out.println(myCar.getRadioStation(1));

        myCar.getWheelsStatus();
        myCar.puncher("Front right");
        myCar.puncher("qsqsdbdf");
        myCar.puncher("Rear left");
    }
}
