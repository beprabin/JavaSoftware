/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PRABIN
 */
public class CalcDemo {
      CalcDemo(){
    Frame f=new Frame();
    f.setLayout(new GridLayout(2,1));
    
    Panel p1=new Panel();
    
    Label l1=new Label("Number 1");
    TextField t1=new TextField();
    Label l2=new Label("Number 2");
    TextField t2=new TextField();                 
    Label l3=new Label("Result");
    TextField t3=new TextField();
    p1.setLayout(null);
    l1.setBounds(20,10,100,30);
    l2.setBounds(20,50,100,30);
    l3.setBounds(20,90,100,30);
    t1.setBounds(130,10,100,30);
    t2.setBounds(130,50,100,30);
    t3.setBounds(130,90,100,30);
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(l3);
    p1.add(t3);
   
    
    
    Panel p2=new Panel();
    Button b1=new Button("+");
    Button b2=new Button("-");
    Button b3=new Button("*");
    Button b4=new Button("/");
    p2.setLayout(null);
    b1.setBounds(40,20,40,20);
    b2.setBounds(90,20,40,20);
    b3.setBounds(140,20,40,20);
    b4.setBounds(190,20,40,20);
    
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    
    f.add(p1);
    f.add(p2);
    f.setSize(300,400);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    }
    public static void main(String[] args) {
        new CalcDemo();
    }
}