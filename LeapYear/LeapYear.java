/*MD SIFAT HOSSAIN 153402342
 */
package LeapYear;

import java.util.Scanner;

public class LeapYear {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter A Year");
        int year = input.nextInt();
        
            if(year%400==0)
            System.out.println(year+"is leap year");
            
            else if (year%4==0 && year%100!=0)
            System.out.println(year+"is leap year");
            else 
            System.out.println(year+"is not leap year");
            
        
    }
    
}
