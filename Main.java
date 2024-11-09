

//ELC(Executable logic class)
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.acceptData("Ravi", 12000);
        c1.displayData();
      // For this keyword
        manager m1 = new manager();
        m1.acceptdata(23, "Keshav");
        m1.showData();
      // For data hiding
        Bankcustomer b1 = new Bankcustomer();
        //b1.Balance = 100; //someone acan easily access the balance so thats  we used private modifier
        b1.deposit(1000);
        
    }
    
}
