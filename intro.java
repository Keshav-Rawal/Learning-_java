/*  Object Oriented Programming(oops):
--------------------------------------
It is a methodolgy to develop and design the programs using class and object.

Advantages of OOPs
1) Modularity
2) Reusability
3)Flexibility

Features
------------------------------------
1) Class 
2) Object
3) Abstsraction
4) Encapsulation
5) Inheritance
6) Polymorphism



Class 
--------------------
A class is a model/template/Blueprint/prototype for creating object.
A class is a logical entity.
A class is a userdefined data type  


                           Organization
                          ----------------
                          
BlackSmith                                                       Engineer
==========                                                       =========


object
-------
An object is a physical entity. Which exist in the real world.

Characteristics:
---------------
1) Identification(Name of the object)
2) Properties(variables)
3) Behaviour(Function/Methods)

** Important object ki properties or Behaviour ko defined krne ke liye hum class ka use karte hai

Example of Class:
----------------
class Student
{

}

How to create the object:
------------------------

Student s1 = new Student();

Student=>Name of class
S1=>Reference Variable

new=> Keyword for dynamic memory Allocation
Student()=> Constructor



class Fan
{
int coil;
int wings;
public void start()
{


}
public void stop()
{


}


}

Fan bajaj = new Fan()

example of Student object in student.java






Variables:
----------
int x  = 10;
int y = 20;

-> A variable is a name given for the memory lication
-> A variable can change its value during the execution of the program.
-> A  variable will hold same kind of value till the end of the programs


Drawback of variable 
------------------
A varibale can hold only one value at a time




Types of variables in java 
--------------------------
A -> Based on the  Data types
1) Primitive Variables 
  eg -int x = 23;

2) Reference variables
   Student s1 = new Student();  

B -> Based on the declaration position(4 types)

1) Instance variable(Non-static field)
2) class variable(Static variable)
3) local variable 
4) Parameters variable 

class Test{
int x; //Instance variable
static int y; // class variable

public void accept(int z // parameter  varible )
{
  int a  = 12; // local variable
}


}

local varibles:
----=-=-=-=-=-=-=-=

A local variable must be initialized and we can,t use any kind of access modifier except final



Constructor( class ka naam and function ka naam same ho to usse constructor bolte hai and constructor kabhi bhi return type nahi leta)
-----------
* bydefault constructor instance varibale ko bydefault value initialized karta hai
class Test 
{
  public Test() // Constructor
}



 why we pass parameter to a method?
 Ans -> To get more info. regarding method

 deposit(int dep){
 
 
 }

 deposit(5000);

 sleep(int hrs){

 }

 sleep(7)


class Test
{
int a; // Instance varibale 
Static int b ; // class  variable 

public void input(int c ) // c is a parameter variable 
{
int d = 10 ; // local variable
}

}
        
Instance variable :
-------------------

If a non- static variable defined inside a class but outside of a method it is called instance variable.
It is accessibility is concerned within the same class. 

Parameter variable
------------------
If we define any variable as a method parameter then it is called parameter variables.It is used to accept the  value from outer world





how to write BLC(Business Logic Class) and ELC(Executable Logic class)
Q Standard way of writtinga a OOPS
Ans Write each class seprately so that it can increase reuseability 

// BLC(Business Logic Class)
class Student
{
}
// ELC(Executable Logic class)

class main {

public static void main(String args[])

{
}
}
* imp same file mei sirf ek hi class ko public declare kr sakte hai sirf

agar file ka naam main hai to sirf main class ko hi public krsakte hai ek file mei sirf ek hi class ko public
decleared krakte hai

// Role of instance variables at object creation
//Whenever we create an object in java a separate copy of all the instance variable will be created
 to getting more about go Test.java





 // "This" keyword
jb bhi programming mei instance variable and parameter variable ka naam same ho jaye to usse avoid krne ke 
liye hum use krte hai this keyword
this keyword always refers to the current object (agar hum program mei khi pr bhi current object ka use krna chaihe to this keyword ka use krenge)
this keyword ko hum static member ke saath use naahi kr sakte(public static {not used this})
refers manager.java file for this.
can not use this in static context








Data hiding
-----------
Object ki properties and behaviour direclty outer world ke through  access naahi hona chaihe
Refers bankcustomer and main.java fot this
*/


