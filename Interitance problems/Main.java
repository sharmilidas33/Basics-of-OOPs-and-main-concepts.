class Employee {
    double salary= 56000;
}
//Single Interitance
class Programmer extends Employee{
    double bonus= 10000;
}

//Multilevel Interitance
class Tester extends Programmer{
    double bonus= 5000;
}

//Hierarchical Inheritance
class Manager extends Employee{
    double bonus =234.987 ;
    void setSalary(){
        double newSalary= salary-10000;
        System.out.println("Manager's salary is: "+newSalary);
    }
}
class Main{
    public static void main(String[] args) {
        Programmer p= new Programmer();
        System.out.println("Salary of programmer is "+p.salary);
        System.out.println("Bonus of programmer is: "+p.bonus);

        Tester t= new Tester();
        System.out.println("Salary of Tester is "+t.salary);
        System.out.println("Bonus of Teser is: "+t.bonus);

        Manager m= new Manager();
        m.setSalary();
        System.out.println("Bonus of Manager is: "+m.bonus);
    }
} 
