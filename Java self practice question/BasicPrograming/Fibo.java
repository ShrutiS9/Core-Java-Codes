package BasicPrograming;

import java.util.Scanner;
/*Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes */
public class Fibo 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int n=sc.nextInt();
        int s=0;
        int fib[]=new int[2*n+1];
        fib[0]=0;
        fib[1]=1;

        if(n<=0)
             System.out.println("0");
        else
             System.out.print(fib[0]+" "+fib[1]);
        for(int i=2;i<=2*n;i++)
        {
            fib[i]=fib[i-1] +fib[i-2];
            System.out.print(" "+fib[i]+" ");

            if(i%2==0)
                s+=fib[i];
        }
         System.out.println("");
        System.out.println("Sum of Fibonacci Series Numbers of First N Even Indexes : "+s);



        
    }
    
}
