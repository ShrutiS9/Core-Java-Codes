
//function interface
@FunctionalInterface  //annotation
interface Demo123{
    void disp();
   // void disp2();

}

//this is parent class
@Deprecated
class Plane123
{
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }

}

//this is child classor subclass
class CargoPlane123 extends Plane123
{
    //overriden method from parent class
    @Override
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Cargoflies at low");
    }

}

public class API8Annotation
{
    public static void main(String []args)
    {
        //object of child classes
        Plane123 cp=new CargoPlane123();
    }
    
}
