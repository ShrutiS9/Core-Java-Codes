package BasicPrograming;

import java.util.Scanner;

public class DisplayPrimeNo 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i,j;
       if(n==0 || n==1)
            System.out.print(n+" "+"is not prime no1");
        
        for(i=2;i<=n;i++)
        {
            for(j=2;j<=i;j++)
               {
                if(i%j==0)
                    {
                    break;
                    }
                }
            if(i==j)
                {
                System.out.print(j+" ");
                }
        }
        
    }
    
}
