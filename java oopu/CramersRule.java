import java.util.Scanner;
 class CramersRule
{
    public static void main(String []args) 
    {
        
        System.out.println("Enter the value of equation-1");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of a:");
        float a=sc.nextFloat();
        System.out.println("Enter value of b:");
        float b=sc.nextFloat();
        System.out.println("Enter value of e:");
        float e=sc.nextFloat();

        System.out.println("Enter the value of equation-2");
        System.out.println("Enter value of c:");
        float c=sc.nextFloat();
        System.out.println("Enter value of d:");
        float d=sc.nextFloat();
        System.out.println("Enter value of f:");
        float f=sc.nextFloat();
        
        float x=(e*d-b*f)/(a*d-b*c);
        float y=(a*f-e*c)/(a*d-b*c);

        System.out.println("The value of x:"+x);
        System.out.println("The value of y:"+y);

    
    }
}