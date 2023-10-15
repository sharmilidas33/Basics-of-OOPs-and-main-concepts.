package Interface;

interface Bank {
    double rateofInterest();
}

class SBI implements Bank {
    @Override
    public double rateofInterest() {
        return 9.265;
    }
}

class ICICI implements Bank {
    @Override
    public double rateofInterest() {
        return 8.245;
    }
}

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        System.out.println("Rate of SBI: " + s.rateofInterest());
        System.out.println("Rate of ICICI: " + i.rateofInterest());
    }
}
