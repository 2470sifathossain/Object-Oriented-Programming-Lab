/*
 Md Sifat Hossain
 */
package Ifelse;

/**
 *
 * @author USER
 */
public class Account {
    
    String AccountName;
    int AccountNumber;
    double Balance;
    
    void diposit(double b)
    {
        Balance = Balance+b;
        System.out.println("Taka" +b +"is Diposit Successfully");
         System.out.println("your current balance is "+Balance+"TAKA");
    }
    void withdraw(double b)
    {
        if (Balance<b)
             System.out.println("You have NoT Enough Taka");
        
        else {
            Balance=-b;
             System.out.println(b+"Taka Withdraw From your Account");
              System.out.println("your current balance is "+Balance+"TAKA");
        }
    }
}
