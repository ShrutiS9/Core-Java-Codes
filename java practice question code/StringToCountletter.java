import java.util.*;
public class StringToCountletter {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the string:");
        String str1=sc.nextLine();
        
       int vowel=0,consonant=0,digit=0,specialchar=0;
       str1=str1.replace(" ","");
       for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)>='a'&&str1.charAt(i)<='z' ||str1.charAt(i)>='A'&&str1.charAt(i)<='Z'){
        if(str1.charAt(i)=='a'||str1.charAt(i)=='A'||str1.charAt(i)=='e'||str1.charAt(i)=='E'||
        
        str1.charAt(i)=='i'||str1.charAt(i)=='I'||str1.charAt(i)=='o'||str1.charAt(i)=='O'||str1.charAt(i)=='u'||str1.charAt(i)=='U'){
            vowel++;
        }else{
            consonant++;
        }
    }
        else if(str1.charAt(i)>='0'&&str1.charAt(i)<='9'){
            digit++;
        }else{
            specialchar++;
        }
       
       }
       System.out.println(vowel);
       System.out.println(consonant);
       System.out.println(digit);
       System.out.println(specialchar);




    }
}
