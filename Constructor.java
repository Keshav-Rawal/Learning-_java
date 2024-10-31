public class Constructor {
    int sno;// instance variable
    String sname; // instance variable

    public void talk(){
        System.out.println(sno);
        System.out.println(sname);

    }

    public static void main(String args[]){
        Constructor c1 = new Constructor();
        c1.talk();
    } 


    
}
