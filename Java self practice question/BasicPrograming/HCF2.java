package BasicPrograming;

public class HCF2 {
    public static void main(String []args)   
    {  

    int x = 47, y = 76;
        System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y));
     }  


    static int GCD(int x, int y)
    {
   
        System.out.println(" "+x+" "+y);
        if (y == 0){
        System.out.println(" when y==0  "+x);

            return x;
        }
        System.out.println(" else  "+x+" "+y);
        return GCD( y,x%y);     
    }
    
}
