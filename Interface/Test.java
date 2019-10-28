package Interface;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Final f = new Final();
        f.sum(100, 200);
        f.showName();
        System.out.println("Message = "+f.sendMessage());
        
          
    }
    
}

interface First{
    void sum(int x, int y);
}
interface Second{
    String NAME = "sifat hossain";
    void showName();
}
interface Third{
    String sendMessage();
}
interface Fourth{
    String MSG = "This is the message.";
}

class Final implements First, Second, Third, Fourth{
   @Override
   public void sum(int x, int y){
       System.out.println("Sum = "+ (x+y));
   }
   @Override
   public void showName(){
       System.out.println("Name = "+NAME);
   }
   @Override
   public String sendMessage(){
       return MSG;
   }
}