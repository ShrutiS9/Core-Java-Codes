public class Demo3 {
    public void num(short i){
        System.out.println(i);
    }
    public void num(float d){
        System.out.println(d);
    }
    public static void main(String []args){
        Demo3 sc=new Demo3();
        sc.num(2);
        sc.num(10l);
       // sc.num(10.5);
    }
}