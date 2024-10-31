public class employee {
    int eno;
    String ename;

    public void accept(){
        eno =123;
        ename = "keshav";

    }

    public void show(){
        System.out.println("Employee Number is "+ eno);
        System.out.println("Employee Name is "+ ename);
        
    }

    public static void main (String args[]){
        employee e1 = new employee(); // calling default constructor
     e1.accept();
     e1.show();
    }
    
}
