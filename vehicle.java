import java.util.*;

abstract class Vehicle
{
 boolean hashelmet;
 int yom;
 Vehicle(boolean h,int y)
 {
  this.hashelmet = h;
  this.yom = y;
 }
 abstract void getData();
 abstract void putdata();
}

class TwoWheeler extends Vehicle
{
 Scanner input = new Scanner(System.in);
 private String Brand;
 protected int Cost;
 String EngineType;
 public String Color;
 TwoWheeler(int m)
 {
   super(true,m);
 }
 void getData()
 {
   System.out.println("Enter Brand:");
   this.Brand = input.next();
   System.out.println("Enter Cost:");
   this.Cost = input.nextInt();
   System.out.println("Enter Engine type:");
   this.EngineType = input.next();
   System.out.println("Enter Color:");
   this.Color = input.next();
 }
 void putdata()
 {
   System.out.println("Brand:"+Brand+"Cost"+Cost+"EngineType"+EngineType+"Color"+Color);
 }
}

class FourWheeler extends Vehicle
{
 FourWheeler(int n)
 {
   super(false,n);
 } 
 void getData(){ }
 void putdata(){System.out.println("Has helmet:"+hashelmet+"\nYear of manufacture:"+yom); }
}

class vehicle
{
 public static void main(String args[])
 {
   TwoWheeler t1 = new TwoWheeler(2013);
   FourWheeler f1 = new FourWheeler(2010);
   t1.getData();
   t1.putdata();
   f1.putdata();
 }
}

