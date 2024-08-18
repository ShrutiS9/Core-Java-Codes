public class condoptrs {
    public static void main(String []args)
    {
         System.out.println(false & 5/0==2);
         System.out.println(false && 5/0==2);
         int x=5;
         if(x%2==0 && x%3==0){
            System.out.println(x);
         }
         int val=7;
         System.out.println(val<5 || val>10);
         System.out.println(true | 5/0==2); 
         System.out.println(true || 5/0==2); 
          

    }
}
