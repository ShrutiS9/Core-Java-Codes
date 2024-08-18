class Aeroplane2{
    public void takeoff(){
        System.out.println("Areoplane is taking off");
    }
    public void fly(){
        System.out.println("Areoplane is flying");
    }
}
class Cargoplane2 extends Aeroplane2{
    public void takeoff(){
        System.out.println("Cargoplane requir longer runway");
    }
    public void fly(){
        System.out.println("Cargoplane plane fiy at lower height");
    }
}
class Passengerplane2 extends Aeroplane2{
    public void takeoff(){
        System.out.println("Passengerplane requir longer runway");
    }
    public void fly(){
        System.out.println("Passengerplane plane fly at higher height");
    }
}
class Airport{
   public void poly(Aeroplane2 ref)
   {
    ref.takeoff();
    ref.fly();
    System.out.println("-----------------------------------------------");
   }
}
public class poly2{
    public static void main(String []args){
    Cargoplane2 cp=new Cargoplane2();
    Passengerplane2 pp=new Passengerplane2();
    Airport a=new Airport();
    a.poly(cp);
    a.poly(pp);
    }
}
