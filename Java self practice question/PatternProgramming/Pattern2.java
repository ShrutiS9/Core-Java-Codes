package PatternProgramming;
/*Java Program to Print Left Triangle Star Pattern */

public class Pattern2 
{
    public static void main(String []args)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if( j==0 || j+i<=n-1)
                     System.out.print(" ");
                else
                     System.out.print(j);
            }
            System.out.println("");
        }
    }
    

}

