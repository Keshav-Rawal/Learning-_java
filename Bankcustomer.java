//BLC
public class Bankcustomer {
    private double Balance = 10000;

    public void deposit(int amount){
        Balance = Balance + amount;
        System.out.println("Balance after Deposit " + " " + Balance);

    }
    
    public void withdraw(int amount){
        Balance = Balance - amount;
        System.out.println("Balance after withdraw " + " " + Balance);

    }
    
}
