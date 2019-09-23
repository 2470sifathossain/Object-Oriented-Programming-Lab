/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ifelse;

/**
 *
 * @author USER
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a = new Account();
        a.AccountName=  "Sifat hossain";
        a.AccountNumber=1010;
        a.Balance=20000;
        a.diposit(5000);
        a.withdraw(500);
        a.withdraw(100000);
    }
    
}
