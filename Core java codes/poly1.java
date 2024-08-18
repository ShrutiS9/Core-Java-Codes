class AeroPlane_1
{

    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane extends AeroPlane_1
{

    
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane_1
{
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger");
    }

}
class poly1
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        //cp.takeOff();
        //cp.fly();
       // cp.carryGoods();

        PassengerPlane pp=new PassengerPlane();
        //pp.takeOff();
        //pp.fly();

        AeroPlane_1 ref;
        ref=cp;
        ref.takeOff();
        ref.fly();
        //ref.carryGoods();
        System.out.println("-------------------------------------------------");
       
        ref=pp;
        ref.takeOff();
        ref.fly();


       
       
        
    }
}

