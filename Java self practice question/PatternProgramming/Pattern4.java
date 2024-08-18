package PatternProgramming;
/* print the reverse string  */
public class Pattern4 
{
    public static void main(String []args)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||i>=j)
                    System.out.print(" ");
                else
                    System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
