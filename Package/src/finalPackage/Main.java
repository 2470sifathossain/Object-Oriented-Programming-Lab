/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalPackage;
import packageB.*;
import packageA.*;

/**
 *
 * @author Admin-24
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b = new B();
        System.out.println("Factorial = "+b.fact(5));
        System.out.println("Subtraction = "+ Mathe.sub(12,2));
        System.out.println("Summation = "+ Mathe.sum(12,2));
        
        A a = new A();
        a.sum(30, 20);
        System.out.println("Max = "+ a.getMax(30, 40));
        
        Remo r = new Remo();
        r.display();
    }
    
    
    
}


class Remo implements Remon{
    @Override
    public void display(){
        System.out.println("Remon");
    }
}
