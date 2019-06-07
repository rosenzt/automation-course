package polymorphism;

public abstract class Shape {
     private String color;

     public Shape(String color) {
          this.color = color;
     }

     public abstract double calcArea();
}
