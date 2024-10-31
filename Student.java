public class Student {
    int rollnumber;
    String name;
    double height;

    public void talk(){
        System.out.println("My Roll number is :"+rollnumber);
        System.out.println("My Name  is :"+name);
        System.out.println("My Height  is :"+height);
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollnumber = 111;
        s1.name = "Keshav";
        s1.height = 6.4;
        s1.talk();
   
    }     

}
