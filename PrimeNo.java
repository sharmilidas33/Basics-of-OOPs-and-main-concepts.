public class PrimeNo {
    public static void main(String[] args) {
        int num=19;
        boolean is_prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                is_prime=false;
            }
        }
        if(is_prime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
