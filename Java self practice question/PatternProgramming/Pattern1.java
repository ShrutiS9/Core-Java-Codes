package PatternProgramming;

/*Java Program to Print Right Triangle Star Pattern */
public class Pattern1
{
    public static void main(String []args)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" "+j+" ");
            }
             System.out.println();
        }
    }
    
}
