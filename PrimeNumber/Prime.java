/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumber;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter First Number" );
       int fn = input.nextInt();
       System.out.println("Enter Second Number" );
       int sn = input.nextInt();
       int count=0;
       
       for (int i=fn;i<=sn;i++)   
       {
           if(isPrime(i))
           {
               count++;
               System.out.println(i+" ");
           }
       }
        System.out.println("\n"+"Total ="+count );
        
       
    }
    static boolean isPrime(int m)
    {
        int i,tag=1;
        int l = (int)Math.sqrt(m);
        for(i=2;i<=1;i++)
        {
            if(m%i==0)
            {
                tag=0;
                break;
                
            }
        }
        
        if(tag==1)
            return true;
        else
            return false;
    }
    
    
}
