public class Overloading {
    //Compile-time Polymorphism(method-overloading)

    void student(String name){
        System.out.println("I am student 1 "+name);
    }

    void student(String name, int roll){
        System.out.println("I am student 2 "+name+" with roll no "+roll);
    }

    public static void main(String[] args) {
        Overloading S= new Overloading();
        S.student("Sharmili");
        S.student("Riya", 21);
    }
}
