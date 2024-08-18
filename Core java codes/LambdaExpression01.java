@FunctionalInterface
interface Twowheeler
{
    //void bicycle(int i);
    int bicycle(int i);
  
}



public class LambdaExpression01 {
    public static void main(String []args)
    {
        // Twowheeler obj= (i)->{
        // System.out.println(" driving.....");
        // System.out.println("without fuel");
        
        // };
        // obj.bicycle(3);
        Twowheeler obj=(i)->
            0;
        
        obj.bicycle(5);


    }
    
}
