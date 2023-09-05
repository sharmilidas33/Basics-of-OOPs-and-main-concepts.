
public class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        Calculate c= new Calculate();
        int result= c.cube(6);
        System.out.println("Result: "+result);
    }
}
