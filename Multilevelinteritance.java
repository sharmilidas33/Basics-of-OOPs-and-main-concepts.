class Shape{
    public void area(){
        System.out.println("Prints area: ");
    }
}
class Triangle extends Shape{
    public void area(int b, int h){
        double a= 0.5*b*h;
        System.out.println(a);
    }
}
class EquilateralTriangle extends Triangle{
    public void color(){
        System.out.println("Green");
    }
}
public class Multilevelinteritance {
    public static void main(String args[]){
        EquilateralTriangle obj1= new EquilateralTriangle();
        obj1.area(2, 8);
        obj1.area();
        obj1.color();
    }
}
