package ClassObject;

public class Test1 {
      int a;
     String name;
     static int b;

      public 
      void call()
     {
        System.out.println("method call called...");
        
        System.out.println(a);
         System.out.println(b);
        
     }
     public static void display()
     {
        System.out.println("method display called...");
         Test1 obj1=new Test1();
        System.out.println(obj1.a);
         System.out.println(b);
        
     }
    public static void main(String []args)

    {
        Test1 obj1=new Test1();
        int num=9;

        Test1 obj2=new Test1();
        obj1.name="Navin";
        System.out.println(obj1.a);
         System.out.println(b);
         int[] []a;
        
       

    }
}
