package PatternProgramming;

public class Pattern5 
{
    public static void main(String []args)
    {
        int n=10;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 ||j==0||i==n||j==n ||i+j<=n/2 ||i-j>=n/2 ||j-i>=n/2
                ||i+j>=n+n/2)
                        System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
