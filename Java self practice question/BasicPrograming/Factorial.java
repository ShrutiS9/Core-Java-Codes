package BasicPrograming;

import java.util.Scanner;

public class Factorial
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int n=sc.nextInt();
        int fact=1;
        if(n==0)
             System.out.println("factorial of zero is 1");
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("fatorial of "+n+" is "+fact);
    }
}
