interface  A_1
{
    void m1();
}
interface B_1
{
     void m2();
}
abstract class imply implements A_1,B_1
{
    public  void m1()
    {
         System.out.println(" in m1");
    }
}
class ab_1 extends imply{
    public void m1()
     {
         System.out.println(" in m1");
     }
      public void m2()
      {
        System.out.println("in m2");
      }

}
public class Interface02 {
    public static void main(String []args)
    {
        imply  obj=new ab_1();
        obj.m1();
        new ab_1().m1();
    }
 

    
}
