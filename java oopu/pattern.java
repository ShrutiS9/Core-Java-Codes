import java.util.Scanner;
public class pattern{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        int i,j,k;
        for(i=1;i<=str.length();i++){
            for(j=0;j<str.length()-i;j++){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
             System.out.print(str.charAt(k)+" ");
            }
            System.out.println(" ");
        }
        int length=str.length();
        System.out.println(length);
        System.out.println(str.substring(length/2));
    }
}