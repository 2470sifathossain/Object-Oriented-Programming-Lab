/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sen = input.nextLine();
        System.out.println("Sentence: "+sen);
        String a[] = new String[10];
        int i=0, l=0, r;
        String t = "";
        r = sen.indexOf(' ');
        while(l<r){
            t = sen.substring(l,r);
            a[i++] = t.trim();
            l = r+1;
            r = sen.indexOf(' ',l);
        }
        t = sen.substring(l);
        a[i] = t;
        int length = i;
        for(int j=0;j<=length;j++)
            System.out.println(a[j]);
    
        //sorting the arrays
        for(i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                if(a[i].compareTo(a[j])>0){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int j=0;j<=length;j++)
            System.out.println(a[j]);
        
    }
    
    
}