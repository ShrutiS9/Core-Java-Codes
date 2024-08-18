import java.util.Scanner;
public class vowel {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character:");
        char ch=sc.next().charAt(1);
        if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Entered character is vowel");
        }else{
            System.out.println("Entered character is consonant");
        }


    }
}
