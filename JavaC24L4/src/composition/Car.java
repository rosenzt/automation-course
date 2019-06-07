package composition;

public class Car {

    private String manufacturer;
    private long price;
    private int year;
    private String color;
    private Engine engine;

    public Car(String manufacturer, long price, int year, String color, Engine engine) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getManufactor() {
        return manufacturer;
    }

    public void setManufactor(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        getEngine().setWorkingOrNot(true);
    }

    @Override
    public String toString() {
        return "composition.Car{" +
                "manufactor='" + manufacturer + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine=" + engine.toString() +
                '}';
    }
}
