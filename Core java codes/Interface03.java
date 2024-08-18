interface left
{
    void method01();
}

interface right
{
   // void method01();
   //void method01(int i);
   //int method01(int i);
}


public class Interface03 implements left,right
 {
    public void method01(){
        System.out.println(" method name conflict");
    }
     public void method01(int i){
        System.out.println("case 2 method name conflict");
    }
    // public int method01(int i){
    //     System.out.println("case 2 method name conflict");
    // }
    public static void main(String []args)
    {
        Interface03 obj =new Interface03();
        obj.method01();
        obj.method01(12);

    }
    
}
