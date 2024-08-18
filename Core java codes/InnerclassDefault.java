class Abc
{
    public void show()
    {
        System.out.println("in show");
    }

    class Bca
    {
        public void display()
        {
            System.out.println("in display");
        }

        public void show()
    {
        System.out.println("in inner class show");
    }
    }
}

public class InnerclassDefault 
{
    public static void main(String []args)
    {
        Abc obj =new Abc();
        Abc.Bca obj1=new Abc().new Bca();
         Abc.Bca obj2=obj.new Bca();
         new Abc().show();
         obj.show();
         new Abc().new Bca().display();
         obj2.display();


    }
    
}
