// BLC (Business Logic class)

public class Customer {
  String customerName; // instance varible 
  double customerBill; // instance variable

  public void acceptData(String name , double bill){

    customerName = name;
    customerBill= bill;
  }

  public void displayData(){
    System.out.println("CustomerName : "+ "  " +customerName);
    System.out.println("CustomerBill: "+ " " +customerBill);


  }
}
