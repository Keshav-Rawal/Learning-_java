

public class manager {

    int managerId;
    String managerName;

    public void acceptdata(int managerId , String managerName){

        this.managerId = managerId;
        this.managerName = managerName;
       // this.showData();
    }

    public void showData(){
        System.out.println("ManagerName:" + " " + managerName);
        System.out.println("ManagerId:" + " " + managerId);
    }
    
}
