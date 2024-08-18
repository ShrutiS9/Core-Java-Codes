public class Demo2 {
    
    public void  num(){
        System.out.println();
    }
    public void num(int a){
        System.out.println(a);
    }
    public void num(double a){
        System.out.println(a);
    }
    public static void main(String []args){
        Demo2 sc=new Demo2();
        sc.num();
        sc.num(10);
        sc.num(10.0);
    }
}
class Test {
    public void m1(){
    System.out.println("zero arg method");
    }
    public void m1(int i){
    System.out.println("int arg method");
    }
    public void m1(double d){
    System.out.println("double arg method");
    }
    public static void main(String[] args) {
    Test t = new Test();
    t.m1();
    t.m1(10);
    t.m1(10.5);
    }
    }