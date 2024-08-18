package BasicPrograming;

public class HCF1 {
    public static void main(String []args)   
    {  
   

     int x = 100, y = 45;
         System.out.println("GCD of " + x + " and " + y  + " is " + GCD(x, y));

     }  

    static int GCD(int x, int y)
    {
        // Everything is divisible by 0
        if (x == 0){
            System.out.println("x==0 "+y);
            return y;
        }
        if (y == 0){
            System.out.println("y==0 "+x);
            return x;
        }
        // Both the numbers are equal
        if (x == y){
             System.out.println("y==x "+x);
            return x;
        }
  
        // x is greater
        if (x > y){
            System.out.println("x>y "+x+" "+y);
            return GCD(x - y, y);
        }
         System.out.println("else  "+x+" "+y);
        return GCD(x, y - x);
    }

    
    
}
