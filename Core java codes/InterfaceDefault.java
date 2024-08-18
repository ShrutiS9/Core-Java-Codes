interface interf
{
    default void m1()
    {
        System.out.println("default method of interface .....");
    }

    default void m2()
    {
        System.out.println("default method 2 of interface.....");
    }
}
class imply_class implements interf
{
    // default void m3()
    // {
    //     System.out.println("default method .....");
    // }
    public void m2(){
        System.out.println("overriden method of implentation class");
    }

}
public class InterfaceDefault {
    public static void main(String []args)
    {
        interf inf=new imply_class();
        inf.m1();
        inf.m2();
       
    }
    
}
