package PatternProgramming;

public class Pattern7 
{
    public static void main(String []args)
    {
        int n=10;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 ||i<=j && i+j<=n ||i==n ||i>=j && i+j>=n)
                        System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
