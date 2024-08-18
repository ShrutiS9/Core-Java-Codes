 class dem1
 {
    int a,b;
    static{
        System.out.println("static block of parewnt class");
    }
    {
        System.out.println("parent class block");
    }
    public dem1(){
        System.out.println("parent class constructor");
    }
    public dem1(int x, int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
 }class dem2 extends dem1{
    int m,n;
    static{
        
    System.out.println("static block of child class");
    }
    {
        System.out.println("child class block");
    }
    public dem2(){
        this(10,20);
        System.out.println("child class constructor");
    }
    public dem2(int x,int y){
        //super();
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }
}public class inheritanceconstructor {
    public static void main(String []args){
        dem1 d=new dem2();
        dem2 d1=new dem2(10,20);
    }
    
}

                                                                 