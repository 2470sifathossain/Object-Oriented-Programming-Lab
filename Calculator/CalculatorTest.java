/*
 Md. Sifat Hossain 153402342
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner input = new Scanner (System.in);
        System.out.println("Ënter Your Option");
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
        int option = input.nextInt();
        
        
        System.out.println("Ënter Two Number");
        int x= input.nextInt();
        int y= input.nextInt();
        
        switch(option)
        {
        case 1:
                System.out.println("Add" +cal.add(x, y));
                break;
        
        case 2:
                System.out.println("Sub" +cal.sub(x, y));
                break;
        case 3:
                System.out.println("Mul" +cal.mul(x, y));
                break;
         case 4:
                System.out.println("Div" +cal.div(x, y));
                break;
        case 5:
                System.out.println("Mod" +cal.mod(x, y));
                break;       
        }
     
    }
    
}
        //System.out.println("Add" +cal.add(x, y));
        // System.out.println("Sub" +cal.sub(x, y));
        //System.out.println("Mul" +cal.mul(x, y));
        // System.out.println("Div" +cal.div(x, y));
        // System.out.println("Mod" +cal.mod(x, y));