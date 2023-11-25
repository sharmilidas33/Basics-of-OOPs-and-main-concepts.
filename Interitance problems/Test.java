class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle{
    int numDoors;

    Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors= numDoors;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }

    void startEngine(){
        System.out.println("Car Engine Started");
    }
    
}

class Motorcycle extends Vehicle{
    boolean hasSideCar;
    Motorcycle(String make, String model, int year, boolean hasSidecar){
        super(make, model, year);
        this.hasSideCar= hasSidecar;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSideCar);
    }

    void revEngine(){
        System.out.println("Motorcycle engine revived");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c= new Car("Toyota", "abc", 2003, 4);
        Motorcycle m= new Motorcycle("Ferrari", "xyz", 2004, false);
        c.displayInfo();
        m.displayInfo();
        c.startEngine();
        m.revEngine();
    }
}
