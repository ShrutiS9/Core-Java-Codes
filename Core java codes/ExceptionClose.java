import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClose 
{
    public static void main(String []args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try{
            num=sc.nextInt();
            sc.close();//it will close if exception not occur
        }
        catch(InputMismatchException e)
        {
            System.out.println("enter a number");
            sc.close();//it will execute if exception occur
        }
        System.out.println(num);
    }
    
}
//DRY=DONOT REPEAT YOURSELF
