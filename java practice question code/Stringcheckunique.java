import java.util.Scanner;
public class Stringcheckunique{
    boolean uniqueCharacters(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }

        }
    }
        return true;
    
}
 
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the string:");
        String str=sc.next();
        Stringcheckunique s=new Stringcheckunique();
        if(s.uniqueCharacters(str)){
            System.out.println("The string"+str+"has all unique character");
        }
        else{
            System.out.println("The string"+str+"has all dublicate character");
        }



        
}
}



