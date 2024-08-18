class demo{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
    public static void show1(demo obj){
        System.out.println(obj.brand +"   "+obj.price+" "+name);
    }
}
public class static1{
    public static void main(String []a){
        demo ob1=new demo();
        ob1.brand="Apple";
        ob1.price=1500;
        demo.name="smartphone";

        demo ob2=new demo();
        ob2.brand="samsung";
        ob2.price=1700;
        demo.name="smartphone";

        demo.name="phone";

        ob1.show();
        ob2.show();

        demo.show1(ob1);
    }
}