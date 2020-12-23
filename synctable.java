import java.util.*;

class A
{
 synchronized void displayTable(int n)
 {
   try 
   {
     for(int i=1;i<=10;i++)
     {
       System.out.println(i*n);
       Thread.sleep(1000);
     }
   }
   catch(Exception e)
   {
    }
  } 
}
 
class Mul extends Thread
{
 A a;
 int n;
 Mul(A a ,int n)
 {
  this.n = n;
  this.a = a;
 }
 public void run()
 {
  a.displayTable(n);
 }
}

class synctable
{
 public static void main(String args[])
 {
  A a = new A();
  Mul M = new Mul(a,8);
  Mul M1 = new Mul(a,9);
  M.start();
  M1.start();
 }
}

