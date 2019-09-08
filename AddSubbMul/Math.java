/*MD SIFAT HOSSAIN 153402342
 */
package AddSubbMul;

import java.util.Scanner;


public class Math {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter First Number");
        int a = input.nextInt();
        
        System.out.println("Enter Second Number");
        int b = input.nextInt();
        
        System.out.println("Add"+Arithmetic.Add(a, b));
         System.out.println("Add"+Arithmetic.Sub(a, b));
          System.out.println("Add"+Arithmetic.Mul(a, b));
        
        
       
        
    }
    
}
