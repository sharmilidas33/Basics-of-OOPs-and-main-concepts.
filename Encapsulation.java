class Info{
    private String password;
    protected int age;

    //getter 
    public String getpassword(){
        return this.password;
    }
    //setter
    public void setpassword(String password){
        this.password=password;
    }
}
//Encapsulation is when data and functions are combined inside one unit/entity.
public class Encapsulation {
    public static void main(String args[]){
        Info obj1= new Info();
        obj1.age=20;
        System.out.println("Age of the object is: "+obj1.age);
        obj1.setpassword("abc");
        System.out.println("Password is "+obj1.getpassword());
    }
}


