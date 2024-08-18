package PatternProgramming;

/*Java Program to Print Pyramid Number Pattern */
public class Pattern3
{
    public static void main(String []args)
    {
        int n=10;
        int x=10;
        for(int i=n-1;i>0;i--)
        {
            for(int j=n-1;j>0;j--)
            {
                if(j==0 ||i+j>=(n-1))
                     System.out.print(" ");
                else
                     System.out.print(j+" ");
            }
             System.out.println("");
        }
       
        
    }
    
}
