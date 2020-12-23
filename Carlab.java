import java.util.*;

class Car
{
  int speed;
  double regPrice;
  String Color;
  Car(int s,double reg,String c)
  {
    speed = s;
    regPrice = reg;
    Color = c;
  }
  double getSalePrice()
  {
     return regPrice;
  }
}

class Truck extends Car
{
  int weight;
  Truck(int s,double reg,String co,int w)
  {
    super(s,reg,co);
    weight = w;
  }
  double getSalePrice()
  {
    if(weight>2000)
      return (regPrice-(regPrice*0.1));
    else
      return (regPrice-(regPrice*0.2));
  }
}

class Ford extends Car
{
  Ford(int s,double r, String c , int y , int manf)
  {
    super(s,r,c);
    Year = y;
    manfDisc = manf;
  }
  int Year;
  int manfDisc;
  double getSalePrice()
  {
    regPrice -= manfDisc;
    return regPrice;
  }
}

class Sedan extends Car
{
  Sedan(int s,double price,String c,int l)
   {
     super(s,price,c);
     length=l;
   }
  int length;
  double getSalePrice()
  {
    if(length >20)
      return (regPrice-(regPrice*0.05));
    else
      return (regPrice-(regPrice*0.1));
  }
}

class MyOwnAutoShop
{
  public static void main(String[] args)
  {
    Car c = new Car(60,2000,"blue");
    System.out.println("Car:"+c.getSalePrice());
    Truck t = new Truck(70,1000,"red",2500);
    System.out.println("Truck:"+t.getSalePrice());
    Ford f = new Ford(80,1200,"black",2019,500);
    System.out.println("Ford:"+f.getSalePrice());
    Sedan s = new Sedan(75,1500,"grey",25);
    System.out.println("Sedan:"+s.getSalePrice());
  }
}

