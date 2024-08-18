import java.util.Scanner;

public class prac3 {
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter value:");
       int a=sc.nextInt();
       for(int i=1;i<=a;i++){
        if(i%5==0 && i%7==0){
            System.out.println(i);
        }
       }
    }
}
