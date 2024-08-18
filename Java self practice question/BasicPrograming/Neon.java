package BasicPrograming;

public class Neon
{
    public static void main(String []args)
    {
        int n=9;
        int sum=0;
        int sqr=n*n;
        while(sqr>0)
        {
            int rem=sqr%10;
            sum=sum+rem;
            sqr=sqr/10;

        }
        if(sum==n)
        {
            System.out.println(n+" it is neon number");
        }
        
    }
    
}
