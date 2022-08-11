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
 * @author USER
 */
public class CalculatorDemo {
    CalculatorDemo(){
    Frame f=new Frame();
    f.setLayout(new GridLayout(2,1));
    
    Panel p1=new Panel();
    
    Label l1=new Label("Number 1");
    TextField t1=new TextField();
    Label l2=new Label("Number 2");
    TextField t2=new TextField();
    Label l3=new Label("Result");
    TextField t3=new TextField();
    p1.setLayout(new GridLayout(3,2));
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
    p2.setLayout(new FlowLayout());
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    
    f.add(p1);
    f.add(p2);
    f.setSize(300,400);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorDemo();
    }
}
