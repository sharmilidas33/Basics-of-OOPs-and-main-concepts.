class Student{
    String name;
    int age;
    //Function overloaded- when different functions have same name.
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class Polymorphism {
    public static void main(String args[]){
        Student obj1= new Student();
        obj1.name="Sharmili";
        obj1.age=20;
        obj1.printInfo(obj1.name);
        obj1.printInfo(obj1.age);
        obj1.printInfo(obj1.name, obj1.age);
    }
}
 