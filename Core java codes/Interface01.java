interface interf01
{
    int num=6;
    void show();
    
}

interface interf02
{
    void abc();

}

interface interf03 extends interf02,interf01
{
    void Abc();
}

class implementation01  implements interf01,interf02,interf03
{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in abc");
    }
    public void Abc(){
        System.out.println("in Abc");
    }

}




public class Interface01 {
     public static void main(String []args){
        System.out.println(interf01.num);
        implementation01 obj= new implementation01();
        obj.show();
        obj.abc();
        obj.Abc();

        interf01 obj1=new implementation01();
        ((interf02)obj1).abc();
        obj1.show();

     }
    
}
