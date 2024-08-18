public class Constructoroverloading {
   public static void main(String []args){
       Student01 st1=new Student01();
       st1.disp1();
       Student01 st2=new Student01("rahul");
       st2.disp1();

   }
   
}
class Student01 {
    private int age;
    private String name;

     Student01(){
        //super;
       // this("vishwa",17);
        System.out.println("default constructor is called");
        name="rohan";
     }
     Student01(String name){
       // this();
        this.name=name;
        age=45;
     }
     Student01(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name);
     }
     public void disp1(){
        System.out.println(name);
        System.out.println(age);
     }
}

