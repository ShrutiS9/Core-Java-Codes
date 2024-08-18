import java.util.Scanner;
public class Array6 {
            int var1;
            
           char ch[]={'a','e','t'};
    public static void main(String []args)
    {
       //int d1=3;
       Array6 ref=new Array6();

       
       int var1=12;
       System.out.println(var1);
       System.out.println(ref.var1);

        
          
        String var=new String(ref.ch);
        System.out.println(var); 
        System.out.println(ref.ch);
        //int b[]={1,3,4,6};
              int  a[][]={{2,4,6} ,{4,74,5}};
            for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
                }
            System.out.println(" ");
        }

        int c[]=new int[5];
        for(int i=0;i<5;i++){
        Scanner sc=new Scanner(System.in);
        //int a[]=new int[5];
        c[i]=sc.nextInt();
        
        }
       // System.out.print(c[0] +","+c[1]+","+c[2]+","+c[3]+","+c[4]);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        
       
           
        
    }    
}
