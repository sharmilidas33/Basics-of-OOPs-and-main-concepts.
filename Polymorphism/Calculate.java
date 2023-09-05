//Method Overloading problem
public class Calculate {
    int add(int a, int b){
        return a+b;
    }
    double add(int a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
    int mul(int a, int b){
        return a*b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Calculate a= new Calculate();
        System.out.println("Add 1: "+a.add(2,3));
        System.out.println("Add 2: "+a.add(2,3.4));
        System.out.println("Add 3: "+a.add("abc","xyz"));
        System.out.println("Multiplication 1: "+a.mul(2,6));
        System.out.println("Multiplication 2: "+a.mul(2,3,6));
    }
}
