interface Employee{
    public void birthplace();
}
interface Salary{
    public void salaryamt();
}
class Sharmili implements Employee,Salary{
    public void birthplace(){
        System.out.println("Born in kolkata");
    }
    public void salaryamt(){
        System.out.println("65k per month");
    }
}
//Interfaces are complete hidden and pure abstract. They dont have any constructors.
public class Interfaces {
    public static void main(String args[]){
        Sharmili s1= new Sharmili();
        s1.birthplace();
        s1.salaryamt();
    }
}