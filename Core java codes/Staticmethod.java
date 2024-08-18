public class Staticmethod {
    int a=10;
    static int b=20;
    public static void main(String []a){
        Staticmethod r=new Staticmethod();
       // r.show();
        r.Disp();
        r.show();
    }
    void Disp(){
        System.out.println("non static()"+a+" "+b);
    }
static void show(){
    System.out.println("static()"+b);
}
// void Disp(){
//     System.out.println("non static"+a+" "+b);
// }
}
