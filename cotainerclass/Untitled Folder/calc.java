import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener
{
 float res=0,a=0;;
String symbol="";
TextField n1;
 Button p,s,m,d,e;
 public void init()
 {
 n1=new TextField(10);
 p=new Button("+");
 s=new Button("-");
 m=new Button("x");
 d=new Button("/");
e=new Button("=");

 add(n1);
 add(p);
 add(s);
 add(m);
 add(d);
add(e);

 p.addActionListener(this);
 s.addActionListener(this);
 m.addActionListener(this);
 d.addActionListener(this);
e.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {

 if(res==0)
{
a=Float.parseFloat(n1.getText());
symbol=ae.getSource();
res=res+a;
}
else
{
if(symbol.equals(p))
{
res=res+a;
}
 if(symbol.equals(s))
 {
 res=res-a;
 }
 if(symbol.equals(m))
 {
 res=res*a;
 }
 if(symbol.equals(d))
 {
 res=res/a;
 }
}
 }
}
