import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinally1 {
    public static void main(String []args)
    {
        int num=0;
        //Scanner sc=new Scanner(System.in);
        // try{
        //     num=sc.nextInt();
        // }
        // finally{
        //     sc.close();
        //     System.out.println("Resource closed");
        // }


         //try with resource
        try(Scanner sc=new Scanner(System.in))           
        {
            num=sc.nextInt();
        }
        System.out.println(num);
    }
}
