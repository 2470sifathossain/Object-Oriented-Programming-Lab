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
public class vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String line = input.nextLine();
        System.out.println("Sentence: "+line);
        int vowels = 0;
        
        line = line.toUpperCase();
        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') {
                ++vowels;
            }
    }
                System.out.println("Vowels: " + vowels);
    
}
}
