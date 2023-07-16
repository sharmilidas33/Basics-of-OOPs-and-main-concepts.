class Shape{
    public void printBase(){
        System.out.println("I am the base class");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        double a= 0.5*l*h;
        System.out.println("Area of the triangle "+a);
    }
}
class Circle extends Shape{
    public void area(int r){
        double p= 3.14*r*r;
        System.out.println("Area of the circle"+p);
    }
}
public class Hierarchialinheritance {
    public static void main(String args[]){
        Triangle obj1= new Triangle();
        obj1.area(4, 8);
        obj1.printBase();

        Circle obj2= new Circle();
        obj2.area(2);
        obj2.printBase();
    }
}
