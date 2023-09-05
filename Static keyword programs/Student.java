//Static Variable and method program
public class Student {
    String name;
    int rollno;
    static String college="SVU";

    Student(String name, int rollno){
        this.name= name;
        this.rollno=rollno;
    }
    
    static void change(){
        college="IIT";
    }

    void display(){
        System.out.println(name +" with Roll no. "+rollno+" studies in "+college);
    }

    public static void main(String[] args) {
        Student sharmili= new Student("Sharmili",20);
        Student riya= new Student("Riya", 10);
        sharmili.display();
        Student.change();
        riya.display();
    }
}
