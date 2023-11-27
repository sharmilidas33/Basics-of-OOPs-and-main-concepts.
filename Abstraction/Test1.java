package Abstraction;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();   
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea(){
        return 0.5*(base*height);
    }
    double calculatePerimeter(){
        return base+height+(Math.sqrt((Math.pow(height,2)) + ((3*base)/4)));
    }
}
public class Test1 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Circle area: "+c.calculateArea());
        System.out.println("Circle perimeter: "+c.calculatePerimeter());

        Triangle t = new Triangle(2, 6);
        System.out.println("Triangle area: " +t.calculateArea());
        System.out.println("Triangle perimeter: "+t.calculatePerimeter());
    }
}
