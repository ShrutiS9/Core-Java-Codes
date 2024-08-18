class demo_class01
{
    public void show()
    {
        System.out.println("in show");
    }


    static class demo_class02
    {
        public void display()
        {
            System.out.println("in display");

        }
    }
}


public class InnerclassStatic
{
    public static void main(String []args)
    {
        demo_class01 obj=new demo_class01();
        demo_class01.demo_class02 obj1=new demo_class01.demo_class02();
        obj.show();
        obj1.display();
    }
    
}
