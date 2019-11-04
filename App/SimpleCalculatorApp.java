/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;





import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin-24
 */
public class SimpleCalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Frame f = new Frame();
       f.method();
    }
    
}

class Frame extends JFrame{
    JButton plus,minus,mul,div,eq;
    JTextField tf;
    String opcode = "";
    int num1, num2, result;
    Frame(){
       // method();
    }
    public void method(){
        tf = new JTextField("",22);
        plus = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq = new JButton("=");
        add(tf);
        add(plus);
        add(minus);
        add(mul);
        add(div);
        add(eq);
        
        //for plus
        plus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
             // tf.setText("You have clicked on plus");
             String s = tf.getText();
             opcode = "+";
             num1 = Integer.parseInt(s);
             tf.setText("");
            }
        });
        
        // for minus
        minus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String s = tf.getText();
                 opcode = "-";
                 num1 = Integer.parseInt(s);
                 tf.setText("");
              
            }
        });
        
        // for mul
        mul.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String s = tf.getText();
                 opcode = "*";
                 num1 = Integer.parseInt(s);
                 tf.setText("");
              
            }
        });
        
        // for div
        div.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String s = tf.getText();
                 opcode = "/";
                 num1 = Integer.parseInt(s);
                 tf.setText("");
              
            }
        });
        
        
        
        
        
        // for equal
       eq.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
              String s = tf.getText();
              num2 = Integer.parseInt(s);
              if(opcode.equals("+"))
                  result = num1+num2;
              else if(opcode.equals("-"))
                  result = num1-num2;
              else if(opcode.equals("*"))
                  result = num1*num2;
              else if(opcode.equals("/"))
                  result = num1/num2;
              tf.setText(result+"");
            }
        });
        
        
      
       
       
       
        
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}

//Swing components
// JButton     JTextField    JLabel
