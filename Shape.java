import java.util.*;

abstract class Shape
{
        String color;
        boolean filled;
        Scanner input = new Scanner(System.in);
        void Shape(){
                color = "Green";
                filled = true;
        }
        void Shape(String s,boolean f){
                color = s;
                filled = f;
        }
        String color(){
                return color;
        }
        Boolean filled(){
                return filled;
        }
        void color(String s){
                this.color = s;
        }
        void filled(Boolean t){
                this.filled = t;
        }
        public String toString()
        {
          if(this.filled == false)
             System.out.println("A Shape with color of "+color+"and notfilled");
          else
             System.out.println("A Shape with color of "+color+"and filled");
        }
        abstract void getArea();
}

class Circle extends Shape{
        int r;

        Circle(int r1)

        { super();
          r=r1;

        }

        Circle(String c,boolean f,int r1)

        { super(c,f);

        r=r1;

        }

        double getArea()

        {

        return 3.14*r*r;

        }

void display()

{

System.out.println(isFILLED());

System.out.println(getColor());

}

 void change(String c,boolean b)

  {
   setColor(c);
   setFILLED(b);
  }
 void getArea(){}
}
class Rectangle extends Shape{
        int w=10,l=20;
        void getArea(){}
}
class Square extends Rectangle{
        void disp(){
             System.out.println("width:"+w+"length:"+l);
        }
}


class Main{
        public static void main(String[] args){
                //Shape s = new Shape(); cannot instantiate abstact class
                Recatangle r = new Rectangle();
                Square s = new Square();
                s.disp();
        }
}

