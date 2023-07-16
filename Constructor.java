class Pen{
    //Data
    String color;
    String type;
    int price;

    //Members
    //Functions that are defined inside a class is called methods.
    public void write(){
        System.out.println("Writing something");
    }
    public void printSoln(){
        System.out.println("My pen is of "+(this.color)+" colour & "+(this.type)+" type whose price is "+(this.price));
    }
}
class Student{
    String name;
    int roll;
    int age;

    public void printDetails(){
        System.out.println("Name: "+(this.name)+" Roll: "+(this.roll)+" Age: "+(this.age));
    }
    //Student() is a special type of function known as constructor which is used to create objects, it doesnt have a return type.
    //A constructor can be called only once. It should be same as the class name for which it is called.

    //Non-parameterized constructor-
    // Student(){
    //     System.out.println("Constructor called");
    // }

    //Parameterized constructor-
    // Student(String name, int age, int roll){
    //     this.name= name;
    //     this.age=age;
    //     this.roll=roll;
    // }

    //Copy constructor-
    Student(Student s2){
        this.name= s2.name;
        this.age=s2.age;
        this.roll= s2.roll;
    }
    Student(){
        
    }
}
public class Constructor{
    public static void main(String[] args) {
        //Object is a member.
        // Pen obj1= new Pen();
        // obj1.color="blue";
        // obj1.type="gel";
        // obj1.price=20;
        // obj1.write();
        // obj1.printSoln();

        // Pen obj2= new Pen();
        // obj2.color="red";
        // obj2.type="dot";
        // obj2.price=10;
        // obj2.write();
        // obj2.printSoln();

        //new is a keyword in which memory will be allocated to store the object.
        //Student() is a special type of function known as constructor which is used to create objects, it doesnt have a return type.
        //A constructor can be called only once. It should be same as the class name for which it is called.
        Student obj1= new Student();
        obj1.name= "Sharmili";
        obj1.age=20;
        obj1.roll=17;

        Student s2=new Student(obj1);
        s2.printDetails();   
    }
}

