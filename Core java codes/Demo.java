public class Demo {
    int a;
    String name;
    public static void main(String[] args){
        //declare variable 
        //create object
        int num1=9; //local variable 
        
        Demo obj1=new Demo();
        int num=9;
        Demo obj2=new Demo(); //refrence //refrence
        obj1.name = "Navin";
        System.out.println(obj1.a);
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);
        }
}
