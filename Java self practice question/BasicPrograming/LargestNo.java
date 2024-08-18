package BasicPrograming;

import java.util.Scanner;

public class LargestNo {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c=sc.nextInt();

        if(a>b && a>c){
           System.out.println("Largest number:"+a);
        }
        else if(b>a && b>c)
            System.out.println("largest  number:"+b);
        else if(c>b &&c>a)
            System.out.println("Largest number:"+c);
        else if(a==b && a>c && b>c)
            System.out.println("both a and b are larger no : "+a+" "+b);
        else if(c==b && c>a && b>a)
            System.out.println("both c and b are larger no : "+c+" "+b);
        else if(a==c && a>b && c>b)
            System.out.println("both a and c are larger no : "+a+" "+c);
        else 
            System.out.println("Enter proper number");

    }
}
