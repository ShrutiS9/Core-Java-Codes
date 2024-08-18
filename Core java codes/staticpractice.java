class practice{
    static int a=4;
    static int b;
    
    int m;
    int n;
    {
        m=100;
        n=200;
        System.out.println("Control in non static block");
    }
    static{
        a=10;
        b=20;
        System.out.println("control in static block");
    }

    static{
        a=106;
        b=207;
        System.out.println("control in static 2 block");
        
    }
    

    // {
    //     m=100;
    //     n=200;
    //     System.out.println("Control in non static block");
    // }
    void display2(){
        //System.out.println("value of static var"+a);
        //System.out.println("value of static var"+b);
        System.out.println("value of non static var"+m);
        System.out.println("value of non static var"+n);
         display1();

    }

    static void display1()
    {
        System.out.println("value of static var"+a);
        System.out.println("value of static var"+b);
    }

    //void display2(){
        //System.out.println("value of static var"+a);
        //System.out.println("value of static var"+b);
       // System.out.println("value of non static var"+m);
        //System.out.println("value of non static var"+n);

    //}
}
public class staticpractice {
    public static void main(String []arrg){
        practice p=new practice();
        p.display2();
        practice.display1();
        // p.display2();
    }
}
