import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinally {
    public static void main(String []args)
    {

        int num=0;
        Scanner sc=new Scanner(System.in);
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a number    "+e.getMessage());
        }
        finally //this will excetue without catch block also
        {
           sc.close(); //resource close
           System.out.println("Resource close");
        }
        System.out.println(num);
    }
}
