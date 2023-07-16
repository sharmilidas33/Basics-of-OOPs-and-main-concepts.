//Single level 
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        double a=(0.5)*l*h;
        System.out.println(a);
    }
}
public class Singlelevelinheritance {
    public static void main(String args[]){
        Triangle obj1= new Triangle();
        obj1.area();
        obj1.area(2,6);
    } 
}
