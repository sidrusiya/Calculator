import javax.swing.*;
import java.awt.event.*;
import java.lang.Math; 
public class Sidvik extends JFrame{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

public Sidvik(){ }

public void setComponents(){
l1=new JLabel("First No.");
l2=new JLabel("Second No.");
l3=new JLabel();
l4=new JLabel();
t1=new JTextField();
t2=new JTextField();
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("/");
b5=new JButton("%");
b6=new JButton("**");
b7=new JButton("&");
b8=new JButton("|");
b9=new JButton("^");
setLayout(null);
l1.setBounds(50,50,100,30);
l2.setBounds(50,100,100,30);
t1.setBounds(150,50,150,30);
t2.setBounds(150,100,150,30);
l3.setBounds(50,150,100,30);
l4.setBounds(150,150,100,30);
b1.setBounds(50,200,50,30);
b2.setBounds(150,200,50,30);
b3.setBounds(50,250,50,30);
b4.setBounds(150,250,50,30);
b5.setBounds(250,200,50,30);
b6.setBounds(250,250,50,30);
b7.setBounds(50,300,50,30);
b8.setBounds(150,300,50,30);
b9.setBounds(250,300,50,30);
b1.addActionListener(new Handler1());
b2.addActionListener(new Handler2());
b3.addActionListener(new Handler3());
b4.addActionListener(new Handler4());
b5.addActionListener(new Handler5());
b6.addActionListener(new Handler6());
b7.addActionListener(new Handler7());
b8.addActionListener(new Handler8());
b9.addActionListener(new Handler9());
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(l4);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
}

class Handler1 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a+b;
  l3.setText("Sum");
  l4.setText(" "+s);
}
}

class Handler2 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a-b;
  l3.setText("Difference");
  l4.setText(" "+s);
}
}
class Handler3 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a*b;
  l3.setText("Product");
  l4.setText(" "+s);
}
}
class Handler4 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a/b;
  l3.setText("Division");
  l4.setText(" "+s);
}
}
class Handler5 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b,s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a%b;
  l3.setText("Remainder");
  l4.setText(" "+s);
}
}
class Handler6 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b;
  double s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=Math.pow(a,b);
  l3.setText("Power");
  l4.setText(" "+s);
}
}
class Handler7 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b;
  int s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a&b;
  l3.setText("Logical AND");
  l4.setText(" "+s);
}
}
class Handler8 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b;
  int s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a|b;
  l3.setText("Logical OR");
  l4.setText(" "+s);
}
}
class Handler9 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  int a,b;
  int s;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  s=a^b;
  l3.setText("Logical EXOR");
  l4.setText(" "+s);
}
}
public Sidvik(String s)
{super(s);}

public static void main(String []args){
Sidvik jf=new Sidvik("Calculator");

jf.setComponents();

jf.setSize(400,400); 
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


}