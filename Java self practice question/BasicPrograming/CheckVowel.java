package BasicPrograming;

import java.util.Scanner;

public class CheckVowel 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch=sc.next().charAt(0);

        if(ch=='a'|| ch=='e' || ch=='i' ||ch=='o'|| ch=='u')
            System.out.println("it is vowel");
        else
            System.out.println("it is not vowel");

    }
    
}
