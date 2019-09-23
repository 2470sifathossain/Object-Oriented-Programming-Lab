/*
 Md Sifat Hossain 153402342
 */
package Inheritance;


public class D {

   
    public static void main(String[] args) {
       A a = new A();
        a.display();
        
        A aa = new A(1.4);
        aa.display();
        
        B b = new B();
        b.display();
        
       B bb = new B(1,55.5);
       bb.display();
       
       C c = new C();
       c.display();
       
       C cc = new C("Sifat Hossain", 2, 100);
       cc.display();
    }
    
}
class A{
    double i;
    A(){
        i = 0;
    }
    A(double x){
        i = x;
    }
    public void display(){
        System.out.println("i="+i);
    }                    
}
class B extends A{
    int j;
    B(){
        i = 0;
        j = 0;
    }
    B(int x, double y){
        j = x;
        i = y;
    }
    @Override
    public void display(){
        System.out.println("i = "+i+"  j="+j);
    }            
}
class C extends B{
    String name;
    C(){
        i = 0;
        j = 0;
        name = null;
    }
    C(String n, int x, double y){
        name = n;
        j = x;
        i = y;
    }
    @Override
    public void display(){
        System.out.println("Name = "+name+" i="+i+ " j="+j);
    }
    }
    

