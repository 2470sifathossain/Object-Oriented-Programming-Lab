/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

public class StringMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        System.out.println("Enter a substring:");
        String sub = input.next();
        int l = sub.length();
        boolean tag = false;
        int k,j,c=0;
        for(int i=0;i<str.length();i++)
        {
            j = 0;c=0;
            for(k=i;k<(i+l) && k < str.length();k++)
            {
                if(str.charAt(k)!=sub.charAt(j))
                {  tag = false;  break;}
                else
                {    c++;j++;tag = true;}
                
            }
            if(tag==true)
                break;
        }
        if(tag==true && c==sub.length())
            System.out.println("Found");
        else
            System.out.println("Not found.");
        
    }
    
}