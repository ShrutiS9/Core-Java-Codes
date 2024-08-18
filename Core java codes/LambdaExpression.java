@FunctionalInterface
interface Car_1
{
   // void drive()
   int drive();
}


public class LambdaExpression {
    

    public static void main(String []args)
    {
       Car_1 obj=()->{
        //System.out.println("driving......");
        return 1;
       };
        
        
        obj.drive();
    }

 
    
    
}
