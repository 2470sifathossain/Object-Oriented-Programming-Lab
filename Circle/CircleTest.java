/*MD SIFAT HOSSAIN 153402342
 */
package Circle;

import java.util.Scanner;


public class CircleTest {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Circle Sifat = new Circle();
        
        System.out.println("Enter Radius");
        Sifat.radius = input.nextDouble();
        
        
        System.out.println("Area"+Sifat.calArea());
        System.out.println("Perimeter"+Sifat.calPerimeter());
        
    }
    
}
