/*
 sifat hossain 153402342
 */
package Qus1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int First = input.nextInt();
        System.out.println("Enter Second Number");
        int Second = input.nextInt();
     
        int mul = 1;
        int i;
        
        for(i = 1; i <= First; i++){
            if(First%i == 0){
                if(Second % i == 0){
                    mul = mul * i;
                }
            }
        }
        
        System.out.println(mul);
    }
}
        
        
    
    
