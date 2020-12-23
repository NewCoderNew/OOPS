import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="calci" width="500" height="600"></applet>*/
public class calci extends Applet implements ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button add1,sub,mul,div;
  public void init()
  {
   l1 = new Label("Enter num:");
   add(l1);
   t1 = new TextField(10);
   add(t1);
   l2 = new Label("Enter num:");
   add(l2);
   t2 = new TextField(10);
   add(t2);
   l3 = new Label("Result:");
   add(l3);
   t3 = new TextField(10);
   add(t3);
   add1 = new Button("+");
   add(add1);
   add1.addActionListener(this);
   sub = new Button("-");
   add(sub);
   sub.addActionListener(this);
   mul = new Button("*");
   add(mul);
   mul.addActionListener(this);
   div = new Button("/");
   add(div);
   div.addActionListener(this);
 }

public void actionPerformed(ActionEvent ae)
{
  int res=0;
  String action = ae.getActionCommand();
  if(action.equals("+"))
  {
   res =Integer.parseInt(t1.getText()) +
   Integer.parseInt(t2.getText());
   t3.setText(String.valueOf(res));
  }
  else if(action.equals("-"))
  {
   res=(Integer.parseInt(t1.getText()) -  Integer.parseInt(t2.getText()));
   t3.setText(String.valueOf(res));
  }
  else if(action.equals("*"))
  {
   res=Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
   t3.setText(String.valueOf(res));
  }
  else
  {
    if(Integer.parseInt(t2.getText()) != 0)
    {res=Integer.parseInt(t1.getText()) /  Integer.parseInt(t2.getText());
     t3.setText(String.valueOf(res));
    }
    else
     System.out.println("Division can't be performed");
  }
 }
} 

