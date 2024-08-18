package PatternProgramming;
/*print the star pascal triangle */
public class Pattern8 
{
    public static void main(String []args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                   
                    System.out.print(" ");
            }
            int a=1;
            for(int k=1;k<=i;k++)
            {
                System.out.print(a+" ");
                a=a*(i-k)/(k);
                    
            }
            System.out.println();
        } 
    }   
    
}
