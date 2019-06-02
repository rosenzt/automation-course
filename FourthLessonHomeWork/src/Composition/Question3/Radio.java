package Composition.Question3;

public class Radio {

    private boolean state;
    private Station stations[];

    public Radio(boolean state, Station[] stations) {
        this.state = state;
        this.stations = stations;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }
}
