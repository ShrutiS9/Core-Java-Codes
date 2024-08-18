abstract class AeroPlane3
{
    //abstract int age;
   //public  abstract static void acc();
    public AeroPlane3(){
        System.out.println("parent ");

    }
    
   abstract public void takeOff();

    abstract public void fly();

    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
    //  void fly(){

    // }
}


class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   } 
   public void alert()
   {
    System.out.println("Alert..");
   } 
}

class PassengerPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}
public class abstract1 
{
    public static void main(String[] args) 
    {
            AeroPlane3 ref1=new CargoPlane3();
            ref1.takeOff();
            ref1.fly();
            ref1.landing();
            ((CargoPlane3) ref1).alert(); //downcasting
            AeroPlane3 ref3=new PassengerPlane3();
            ref3.takeOff();
            ref3.fly();
            ref3.landing();

         // AeroPlane3 ref=new AeroPlane3();
        
    }
    
}