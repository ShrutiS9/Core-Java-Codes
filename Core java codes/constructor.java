class demo4{
    private int a;
    private int b;
    // public demo4(){
    //     System.out.println("Zero paramiterized constructor by programmer");
    // }

    public demo4(int a, int b){
        this.a=a;
        this.b=b;
    }
    demo4(){
        System.out.println("Zero paramiterized constructor by programmer");
    }

    public void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}public class constructor {
    public static void main(String []arrg){
        demo4 d=new demo4();
        d.disp();
        demo4 d1=new demo4(32,42);
        d1.disp();
    }
    
}
