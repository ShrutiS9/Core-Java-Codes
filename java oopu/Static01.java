class mobile{
    String brand;
    int price;
    static String name;

   public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
     public 
     static void show1(mobile obj){
        System.out.println(obj.brand +"   "+obj.price+" "+name);
    }
}
public class Static01{
    public static void main(String []a){
        mobile ob1=new mobile();
        ob1.brand="Apple";
        ob1.price=1500;
        //mobile.name="smartphone";
       ob1.name="jn";

        mobile ob2=new mobile();
        ob2.brand="samsung";
        ob2.price=1700;
        mobile.name="smartphone";

        mobile.name="phone";

        ob1.show();
        ob2.show();

        mobile.show1(ob1); 
    }
}

