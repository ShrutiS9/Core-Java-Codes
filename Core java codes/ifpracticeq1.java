import java.util.Scanner;
public class ifpracticeq1 
{
    public static void main(String []args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter number:");
        int a=in.nextInt();
        if(a%2==0){
            System.out.println("Fizz"); 
        } if(a%3==0)
        {
            System.out.println("Buzz"); 

        } if(a%2==0 && a%3==0){
            System.out.println("FizzBuzz"); 
        }

    }
}