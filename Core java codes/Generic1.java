import java.util.*;

public class Generic1 {
    public static void main(String []args)
    {
        //typesafe
        // String []ar=new String[10];
        // ar[0]="hyder";
        // ar[1]="pw";
        // //ar[2]=10; CE

        // String name1=ar[0];
        // String name2=ar[1];

        //no typesafety
        //type safety achieved using generics
        ArrayList<String> al=new ArrayList<String>();
        al.add("hyder");
        al.add("pw");
        //al.add(10);

        // String n1=(String)al.get(0);//typecasting
        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);
        
        String n1=al.get(0);
        String n2=al.get(1);
        



    }
    
}
