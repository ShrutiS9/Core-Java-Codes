//import java.util.*;
class recursion{
    
    static int fact(int n){
       
        if(n==0){
            return 1;
        }else{
            return(n*fact(n-1));
        }
       // System.out.println(n);

    }

    public static void main(String []a){
        //Scanner sc=new Scanner(System.in);
        
       //int n=sc.nextInt();
       //System.out.println("enter value");
       //recursion ob1=new recursion();
      //int f=fact(5);
      System.out.println(fact(5));

      
    }
    
}
