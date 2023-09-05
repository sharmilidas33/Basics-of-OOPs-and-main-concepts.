//Method overriding example.
class Shape{
    double calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius= radius;
    }
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        return length*breadth;
    }
}
public class Area {
    public static void main(String[] args) {
        Circle c= new Circle(2.5);
        Rectangle r= new Rectangle(2, 2.5);

        System.out.println("The area of circle is "+c.calculateArea());
        System.out.println("Area of rectangle: "+r.calculateArea());
    }
}
