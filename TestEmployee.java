import java.util.*;

class Name extends Exception
{ String name;
  Name(String n)
  {
    name = n;
  }
  public String toString()
  {
   return (name+"is entered incorrectly");
  }
}
class Age extends Exception
{ int age;
  Age(int a)
  {
    age = a;
  }
  public String toString()
  {
   return (age+"is above 50");
  }
}


class Employee
{ 
 String name;
 int age;
 Employee(String n,int a)
 {
  this.name = n;
  this.age = a;
 }
 void display()
 {
  System.out.println("Name:"+this.name+"Age"+this.age);
 }
}

class TestEmployee
{
 public static void main(String args[])
 {
  String n;
  int a,h;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the name and age:");
  n = input.next();
  a = input.nextInt();
  boolean b=true;
  try
  {
    h = Integer.parseInt(n);
    b=false;
    throw new Name(n);
  }
    catch(Name e)
  {
    System.out.println(e);
  }
  try
  {
    if(a>50)
     { 
       b=false;
       throw new Age(a);
     }
  }
  catch(Age e)
  {
    System.out.println(e);
  }
  if(b==true)
  {
    Employee emp = new Employee(n,a);
    emp.display();
  }
 }
}
