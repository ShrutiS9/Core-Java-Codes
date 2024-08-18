class EH_1{
    public void a() throws Exception
    {
        b();
    }
    public void b() throws Exception
    {
        int num1=7;
        int num2=0;
        int result=num1/num2;
        System.out.println(result);
    }
}

public class ExceptionDucking
 {
    public static void main(String []args){
        EH_1 obj=new EH_1();
        try{
            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("error   "+e.getMessage());
        }
    }
    
}
