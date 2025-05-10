
import java.util.Scanner;


public class StringRemoveDublicate{

    void dublicateremove(String str1,int n){
        char ch[]=str1.toCharArray();
        String str2="";
        int i,j;
        for(i=0;i<str1.length();i++){
            
            for(j=0;j<i;j++){
                System.out.println("before condition"+i+" "+j);
                if(ch[i]==ch[j]){
                    System.out.println("value of j"+" "+j);
                   
                    break;
                }
                System.out.println(j);
            }
            System.out.println(i+"      "+j);
                if(j==i){
                    System.out.println("value of i and j"+" "+i+" "+j);
                    str2=str2+ch[i];
                    System.out.println("str2 value"+"   "+str2);
    
                }
            
        }
        System.out.println(str2);


    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any string:");
        String str1=sc.nextLine();
       
        int n=str1.length();
        StringRemoveDublicate s=new StringRemoveDublicate();
        s.dublicateremove(str1,n);
        
       

    }
    
}
