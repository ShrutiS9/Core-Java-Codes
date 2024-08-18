import java.util.*;
public class StringToPrintDublicate {
    
    void printdublicate(char ch[]){
        int i,j;
        int count;
        for(i=0;i<ch.length;i++){
            count=1;
            for(j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]&&ch[i]!=' '){
                    count++;
                    ch[j]='0';//set string[]to 0 to avoid printing visited charater
                }
            }
            if(count>1&&ch[i]!='0'){
                System.out.print(ch[i]+" ");
            }
        }

    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the string:");
        String str1=sc.nextLine();
        int n=str1.length();
        char ch[]=str1.toLowerCase().toCharArray();
        StringToPrintDublicate s=new StringToPrintDublicate();
        s.printdublicate(ch);


    }
}
