 class Animal
{
    static{
        System.out.println("parent class static block");
    }
     static{
        System.out.println("parent class staticc block");
    }
    {
        System.out.println("parent class block");
    }
    public static void species(){
        System.out.println("parent class static method");
    }
   
    public void eat (){
        System.out.println("Animal eats everyday");
    }
    public void age(int x){
        System.out.println("Animal age is");
    }
}class Tiger extends Animal
{
    static{
        System.out.println("child clss static block ");

    }
    public static void species(){
        System.out.println("child class static method");
    } 

    {
        System.out.println("child class block");
    }
    public void eat()
    {
        System.out.println("Tiger hunts and eat");
    }
    public int age(){
        return 10;
    }

    
}public class Inheritance5 {
    
public static void main(String []args){
        Tiger t=new Tiger();
        t.eat();
       t.age();
        t.age(8);
        Animal.species();
        Tiger.species();
    
    Animal t1=new Tiger();
    t1.species();
    Tiger t2=new Tiger();

}
}

