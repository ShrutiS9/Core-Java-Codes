package BasicPrograming;
import java.util.Scanner;
public class OddEven {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any value:");
        int a=sc.nextInt();
        if(a==0)
           System.out.println(a);
        else if(a%2==0)
            System.out.println("Entered number is even");
        else 
        System.out.print("entered number is odd");
       

    }
}
