//Classes are entity than comprises of functions and properties.
//Class is a logical construct and object is physical reality.

//creating a class
class Student{
    //instance variables(outside the method but inside the class)
    int rollno;
    double marks;
    String name;

    public void Student(){
        System.out.println("Name: "+name+" Roll: "+rollno+" Marks: "+marks);
    }

    //Constructor is a special function. It defines what happens when a object is created.
    Student(int rollno, double marks, String name){
        this.rollno= rollno; //Whenever we try to access any property of the class via its object, we use this.
        this.marks = marks;
        this.name= name;
    } //Constructor overloading
    Student(){
        this.rollno=17;
        this.marks=82.34;
        this.name="Mithai";
    }
    Student(Student other){
        this.name= other.name;
        this.rollno= other.rollno;
        this.marks=other.marks;
    }

    void changeName(String newName){
        this.name= newName;
    }
}
public class Main{  
    public static void main (String[] args) {
        Student obj1= new Student(78,90,"Titli"); //dynamically allocates memory & returns a referebce variable to it.
        //Class is a template of an object, object is the instance of a class.
        // obj1.rollno= 10;
        // obj1.marks= 9.50;
        // obj1.name="John";
        obj1.Student();
        obj1.changeName("Sharmili");
        obj1.Student();

        Student obj2= new Student();
        obj2.Student();

        Student obj3= new Student(obj1);
        obj3.Student();
    }
}
