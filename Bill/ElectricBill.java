/*
  Md. Sifat Hossain 153402342
 */
package Bill;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ElectricBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double Totalbill;
        double k = 0;
     
        double unit = input.nextDouble();
        double M = 200; //Minimum Charge=M
        double Mc = 15; //Meter Charge =Mc
        double Dc = 75; //Demand Charge =Dc
        double Lc = 10; //Line Charge =Lc
        
        
        if(unit<=65)
        {
            k=M;
        }
       
        else if(unit>65 && unit<=150)
        {
            k=M+(unit*5.5);
        }
         
        else if(unit>150 && unit<=300)
        {
            k=M+(unit*7.5);
        }
        
         else if(unit>300 && unit<=500)
        {
            k=M+(unit*9.0);
        }
         
         else if(unit>500 && unit<=1000)
        {
            k=M+(unit*10.0);
        }
        
         else if(unit>1000)
        {
            k=M+(unit*15.5);
        }
         else 
         {
             k=M;
         }
        Totalbill=k+Mc+Dc+Lc;    
        System.out.println("Totalbil="+Totalbill);
        
        
    }
    
}
