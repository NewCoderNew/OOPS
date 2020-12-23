
interface Calc
{
 public int res(int x,int y);
}

public class lambda
{
 public static void main(String args[])
 {
  Calc a = (x,y)->(x+y);
   System.out.println("\n SUM is"+a.res(2,5));
  Calc m = (x,y)->(x*y);
   System.out.println("\n PRODUCT is:"+m.res(3,4));
}
}
