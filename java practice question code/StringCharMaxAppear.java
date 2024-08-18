import java.util.Scanner;
public class StringCharMaxAppear{
    static char max_occuring_char(String str){
    int []ar=new int[256];
    for(int i=0;i<str.length();i++){
        ar[str.charAt(i)]++;
    }
    int max=-1;
    char c=' ';
    for(int i=0;i<str.length();i++){
        if(max<ar[str.charAt(i)]){
            System.out.println("=value at ar"+ar[str.charAt(i)]);
            max=ar[str.charAt(i)];
            System.out.println(max);
            c=str.charAt(i);
            System.out.println("value at" +" "+i);
        }
    }
    return c;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the string:");
        String str=sc.next();
        str=str.replace(" ","");
        
     char ch=StringCharMaxAppear.max_occuring_char(str);
        System.out.println(ch);
        
       
        
        

    }
}

