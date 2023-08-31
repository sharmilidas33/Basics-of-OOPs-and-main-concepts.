public class Overriding {
    //Run-time Polymorphism(Methid Overriding)
    void student(String name){
        System.out.println("My name is "+name);
    }
}
class Overriding2 extends Overriding{
    void student(String name){
        super.student("Sharmili");
        System.out.println("Student Name: "+name);
    }
} 
class Main{
    public static void main(String[] args) {
         Overriding obj = new Overriding();
        //  obj.student("Sharmili");
         Overriding2 obj2= new Overriding2();
         obj2.student("Sharmili");
         obj2.student("Titli");
    }
}