import java.util.Scanner;
public class letters {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any line:");
        String str=sc.nextLine();
        int count=0;
    if(str.charAt(0)>=65&&str.charAt(0)<=90){
        count++;
    }
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)>=65&&str.charAt(i)<=90 && str.charAt(i-1)==' '){
            count++;

        }

    }
    System.out.println(count);
}
}
