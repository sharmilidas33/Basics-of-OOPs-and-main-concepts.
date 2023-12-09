package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name;
    int age;
    int rollno;

    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    
}


public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList <Student> studentList= new ArrayList<>();
        studentList.add(new Student("Sharmili",20,17));
        studentList.add(new Student("Annesha",12,17));
        studentList.add(new Student("Moly",20,17));

        Iterator <Student> iterator= studentList.iterator();
        while (iterator.hasNext()){
            Student s= iterator.next();
            System.out.println("Name: "+s.name+"Age: "+s.age+"Roll: "+s.rollno);
        }

        studentList.add(1, new Student("Soham", 20, 40));

        ArrayList <Student> studentlist2 = new ArrayList<> (studentList);

        studentlist2.forEach(s2 -> System.out.println("Name: "+s2.name+"Age: "+s2.age+"Roll: "+s2.rollno));

    }
    
}
