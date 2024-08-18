import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;
public class palindrome {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thew string:");
        String str1=sc.next();
       //String str1="madam";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);

        }
        System.out.println(str2);
        if(str2.equals(str1)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
    
}
