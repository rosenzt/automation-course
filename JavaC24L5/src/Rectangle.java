public class Rectangle extends Shape{

    private double width;
    private double hight;

    public Rectangle(String color, double width, double hight) {
        super(color);
        this.width = width;
        this.hight = hight;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double calcArea(){
        return (width*hight);
    }
}
