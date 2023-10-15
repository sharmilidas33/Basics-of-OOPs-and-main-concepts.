public class Student2 {
    private String college;

    public void setCollege(String college){
        this.college=college;
    }
    public static void main(String[] args) {
        Student2 s2= new Student2();
        s2.setCollege("IIT");
        System.out.println("College name: "+s2.college);
    }
}
