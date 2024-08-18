import java.util.Scanner;
public class prac4 {
    public static void main(String []args){
       Scanner in=new Scanner(System.in);
       System.out.println("enter value:");
       int a=in.nextInt();
       for(int i=1;i<=a;i++){
        if(a%i==0){
            System.out.println(i);
        }else{
            continue;
        }
       }
    }
}
