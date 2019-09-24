package Qus2;
public class Ac {
    public static void main(String[] args) {
         Account Sifat= new Account("Md Sifat Hossain",3000,2000);
         Sifat.diposit(50);
         Sifat.withdrow(700);
    }
    
}
class Account
{
    private String AccountName;
    private int  AccountNo;
    private double Balance;
    Account()
    {
       AccountName="";
       AccountNo=0;
       Balance=0;
    }
    Account(String i,int j,double k )
    {
        AccountName=i;
       AccountNo=j;
       Balance=k;
        
    }
    void diposit(double b)
    {
    
        Balance=Balance+b;
        System.out.println(b+" Taka is Add");
        System.out.println("Your Current Balance is = "+Balance);
        
    }
    void withdrow(double b)
    {
        if(Balance>b){
            Balance=Balance-b;
            System.out.println(b+" Taka is Withdrow");
            System.out.println("Your Current Balance is "+Balance);
        }
        else
            System.out.println("Error blance");
    }
    
    
}
