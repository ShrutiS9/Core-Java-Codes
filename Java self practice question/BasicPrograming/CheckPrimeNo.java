package BasicPrograming;

public class CheckPrimeNo {
    public static void main(String []args)
    {
        int n=7,count=0;

        
        for(int i=1;i<=n;i++)
        {
             if(n==0 || n==1)
            {
                continue;
            }
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime no");
        }
        else
        System.out.println(" not prime no");
    }
}
