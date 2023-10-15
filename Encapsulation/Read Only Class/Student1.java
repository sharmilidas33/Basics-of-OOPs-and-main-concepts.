public class Student1 {
    private String college="HHU";

    public String getCollege(){
        return college;
    }
    public static void main(String[] args) {
        Student1 s1= new Student1();
        System.out.println("College name: "+s1.getCollege());
    }
    
}
