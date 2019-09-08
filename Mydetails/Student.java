/*MD SIFAT HOSSAIN 153402342
 */
//Use Scanner Funtion
//Input From Keyboard

package Mydetails;

import java.util.Scanner;


public class Student {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Your Name Is"+name);
        
        System.out.println("Enter Your Id: ");
        int Id = input.nextInt();
        System.out.println("Your Id"+Id);
        
        System.out.println("Enter Your Department: ");
        String Dep = input.next();
        System.out.println("Your Department"+Dep);
        
        System.out.println("Enter Your Semester: ");
        String sem = input.next();
        System.out.println("Your Semester"+sem);
        
        
        
    }
    
}
