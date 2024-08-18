public class Wrapper1 {
    public static void main(String []args)
    {
       System.out.println(Integer.valueOf(543));
       System.out.println(Integer.valueOf("3487"));
       Integer sa=Integer.valueOf("10101", 2);
       System.out.println(sa);
       System.out.println(Integer.valueOf("10101", 2));
       int i=sa.intValue();
       System.out.println(i);
      // Integer i1=Integer.intValue();
      
       System.out.println(Integer.parseInt("4635"));;

    }
}
