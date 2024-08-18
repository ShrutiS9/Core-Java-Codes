class mobile{
    String brand;
    int price;
    static String name;

    static{
        System.out.println("control in static block of mobile class");
    }

    {
        System.out.println("control in non ");
    }

   public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
     public static void show1(mobile obj){
       // mobile obj=new mobile();
        System.out.println(obj.brand +"   "+obj.price+" "+name);
    }
}
public class Static2{
    
    void display(){
        System.out.println("control in non static method of main class"+mobile.name);
    }
    static void display1(){
        System.out.println("control in main class static method"+mobile.name);
    }
    static{
        System.out.println("control in static block of main class");
    }

    {
        System.out.println("control in non static block of main class");
    }

    public static void main(String []a){
        mobile ob1=new mobile();
        ob1.brand="Apple";
        ob1.price=1500;
        ob1.name="phone";
        
       
        mobile ob2=new mobile();
        ob2.brand="samsung";
        ob2.price=1700;
        ob2.name="Smartphone";

       // mobile.name="phone";


        ob1.show();
        ob2.show();

        mobile.show1(new mobile()); 

        Static2 st=new Static2();
        st.display();
        Static2.display1();
    }
}
