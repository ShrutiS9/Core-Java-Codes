interface Computer
{
    void compilecode();
    default void config()
    {


    }
}

class Laptop implements Computer
{
    public void compilecode()
    {
        System.out.println("you got 5 error");
    }
}

class Desktop implements Computer
{
    public void compilecode()
    {
        System.out.println("you got error faster");
    }
}

class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compilecode();
    }
}

public class InterfaceDemo {
    
    public static void main(String []args)
    {
        Computer obj=new Laptop();
        Developer dev=new Developer();
        dev.buildApp(obj);
    }
}
