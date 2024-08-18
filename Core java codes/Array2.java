import java.util.*;
import java.lang.*;
public class Array2 {
    public static void main(String []args){
        int a[]={45,4354,54445,6567};
        for(int i=0;i<=3;i++){
            System.out.println(a[i]);
        }

        Object obj[]=new Object[3];
        obj[0]=new String("sachin");
        obj[1]=new Integer(10);
        obj[2]=new object();       

        for(int i=0; i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }
    }
}
