@FunctionalInterface
interface inf
{
    void m1();
    default void m2()
    {
        System.out.println("default method ........");
    }

    static void m3()
    {
        System.out.println("static method...");
    }
}

class implementation_class implements inf{
    public void m1()
    {
        System.out.println("method m1 call....");
    }
}



public class InterfaceFunc {
    public static void main(String []args)
    {
        implementation_class i=new implementation_class();
        i.m1();
    }
    
}
