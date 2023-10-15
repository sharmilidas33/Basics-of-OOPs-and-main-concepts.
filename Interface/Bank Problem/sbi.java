class sbi implements Bank2 {
    private double balance;

    public sbi(){
        balance=100.09;
    }

    @Override
    public void deposit(int amount){
        if(amount>0){
            balance= balance+amount;
            System.out.println("Amount deposited & Current Balance is: "+balance);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void withdraw(int amount) {
        if(amount>balance){
            System.out.println("Insufficient Funds!");
        }
        else{
            balance= balance-amount;
            System.out.println("Withdrawn and current balance is :"+balance);
        }
    }
    
}

