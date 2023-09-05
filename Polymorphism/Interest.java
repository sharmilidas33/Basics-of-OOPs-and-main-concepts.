//Method overriding problem. 
class Bank {
    int getInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getInterest(){
        return 9;
    }
}
public class Interest{
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("Interest in SBI: "+s.getInterest());
        System.out.println("Interest in ICICI: "+i.getInterest());
        System.out.println("Interest in AXIS: "+a.getInterest());
    }
}

