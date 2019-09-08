/*MD SIFAT HOSSAIN 153402342
 */
package Exam1;

import java.util.Scanner;

public class TestCase {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
         System.out.println("Enter Equilateral");
         Equilateral e = new Equilateral();
         e.side = input.nextDouble();
        
         System.out.println("Enter Isosceles");
         Isosceles i = new Isosceles();
         i.base = input.nextDouble();
         i.side = input.nextDouble();
         
         System.out.println("Enter RightAngled");
         RightAngled r = new RightAngled();
         r.base = input.nextDouble();
         r.height =input.nextDouble();
         
         
         
         System.out.println("Equilateral"+e.calArea());
         System.out.println("Isosceles"+i.calArea());
         System.out.println("RightAngled"+r.calArea());
         
         
       
        
    }
    
}
