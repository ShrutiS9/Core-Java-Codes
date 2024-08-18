import java.util.Scanner;
public class dec 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();
        System.out.print("Enter third number:");
        int c = input.nextInt();
       
        if(a>b && a>c){
            //System.out.println("a is bigger");
            if(b>c){
               // System.out.println("then b");
                //System.out.println("then c");
                System.out.println("dec order:"+a+","+b+","+c);
            }else{
               // System.out.println("then c");
               // System.out.println("then b");
                System.out.println("dec order:"+a+","+c+","+b);
            }
        }
            if(b>a && b>c){
                //System.out.println("b is bigger");
                if(a>c){
                   // System.out.println("then a");
                    //System.out.println("then c");
                    System.out.println("dec order:"+b+","+a+","+c);
                }else{
                   // System.out.println("then c");
                   // System.out.println("then a");
                    System.out.println("dec order:"+b+","+c+","+a);
                }
            }
            if(c>a && c>b){
                //System.out.println("c is bigger");
                if(b>a){
                    //System.out.println("then b");
                    //System.out.println("then a");
                    System.out.println("dec order:"+c+","+b+","+a);
                }else{
                   //
                   // System.out.println("then a");
                   // System.out.println("then b");
                    System.out.println("dec order:"+c+","+a+","+b);
            }
        }

    }
    
}
