class Student{
    String name;
    static String school;
}

public class Static{
    public static void main(String args[]){
        Student.school="SSN";
        Student s1= new Student();
        s1.name="Sharmili";
        System.out.println("Name: "+s1.name+"School: "+Student.school);
    }
}
