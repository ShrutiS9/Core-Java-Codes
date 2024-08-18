interface I
{
    static void m1()
    {
        System.out.println("static method of interface...");
    }
    static void m2()
    {
        System.out.println("static method of interface...");
    }

}



public class InterfaceStatic {
    public static void main(String []args)
    {
        I.m1();
        
    }

    
}
