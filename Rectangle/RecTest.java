/*MD SIFAT HOSSAIN 153402342
 */
package Rectangle;

import java.util.Scanner;




public class RecTest {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
         Rectangle r = new Rectangle();
        
         System.out.println("Enter length:");
         r.length= input.nextInt();
         
         System.out.println("Enter Width:");
         r.width= input.nextInt();
         
         System.out.println("Area"+r.calArea());
         System.out.println("Perimeter"+r.calPerimeter());
         System.out.println("Diagonal"+r.calDiagonal());
       
    }
    
}
