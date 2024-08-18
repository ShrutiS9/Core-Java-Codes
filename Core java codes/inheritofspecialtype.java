
// class Parent{

//      void methodOne()
//     {
//         System.out.println("methodOne from parent");
//     }

// }

// class Child extends Parent{

//     public void methodOne()
//     {
//         System.out.println("methodOne from child");
//     }

//     public void methodTwo()
//     {
//         System.out.println("methodTwo from child");
//     }

// }

// public class inheritofspecialtype{

//   public static void main(String[] args){

//       Parent p=new Parent();

//               p.methodOne();//methodOne from parent


//        Child c=new Child();

//                 c.methodOne();//methodOne from child

//             c.methodTwo();//methodOne from child


//       Parent p1=new Parent();

//         p1.methodOne();

//        // p1.methodTwo();//CE: can't find the symbol methodTwo in Parent

//     }

// }
class Parent{

    public void methodOne()
    {
        System.out.println("methodOne from parent");
    }
    // public void method()
    // {
    //     System.out.println("method from parent");
    // }

}

class Child extends Parent{

     //@Override

    public void methodOne()
    {
        System.out.println("methodOne from child");
    }

}

public class inheritofspecialtype{

  public static void main(String[] args){

          Parent p=new Parent();

            p.methodOne();//methodOne from parent


       Child c=new Child();
           //c.method();
           c.methodOne();//methodOne from child

     }

}