abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Signifies the colour of the animal");
    }
    public void eats(){
        System.out.println("Animals eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("The colour of horse is brown");
    }
    public void walk(){
        System.out.println("Horse is walking");
    }
}
class Cow extends Animal{
    Cow(){
        System.out.println("White in colour");
    }
    public void walk(){
        System.out.println("Cow is walking");
    }
}
//Abstraction is hiding all the useless information through abstract keyword and only shows the relevant information to the user.
public class Abstraction {
    public static void main(String args[]){
            Horse obj1= new Horse();
            obj1.walk();
            obj1.eats();
    }
}
