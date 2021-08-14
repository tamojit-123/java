import java.awt.*;
import java.awt.event.*;
class percentcalc extends Frame implements ActionListener
{
Button b1;
Label l1=new Label("Amount : ",Label.RIGHT);
Label l2=new Label("Rate : ",Label.RIGHT);
Label l3=new Label("Duration : ",Label.RIGHT);
Label l4=new Label(" ",Label.RIGHT);
TextField t1=new TextField(15);
TextField t2=new TextField(15);
TextField t3=new TextField(15);
percentcalc()
{
setBackground(Color.green);
setTitle("My Frame");
setSize(200,200);
b1=new Button("Calculate");
setLayout(new GridLayout(4,2));
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(l4);
b1.addActionListener( this );
t1.addActionListener( this );
t2.addActionListener( this );
t3.addActionListener( this );
setVisible(true);
addWindowListener( new Window1());
}
public void actionPerformed ( ActionEvent ae )
{
float res=0;
if ( ae.getSource() == b1 )
{
int a=Integer.parseInt(t1.getText());
int r=Integer.parseInt(t2.getText());
int d=Integer.parseInt(t3.getText());
res=(float)(a*d*r)/100;
l4.setText("Result is "+res);
}
else
setBackground(Color.red);
}
public static void main( String arg[ ])
{
 percentcalc s = new percentcalc();
}
}
class Window1 extends WindowAdapter
{
public void windowClosing ( WindowEvent we ) {
System.exit(0);
}
}
