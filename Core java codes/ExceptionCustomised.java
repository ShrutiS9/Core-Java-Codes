public class ExceptionCustomised {
    public static void main(String []args)
   {
    int num1=6;
    int num2=-2;
    try{
        if(num2<0 ||num1<0)
        {
            //System.out.println("enter a valid number");
            Exception e =new ArithmeticException("negative number");
            throw e;
           // throw new Exception();
        }
        else{
            int result=num1/num2;
            System.out.println(result);
        }
    }
    catch(Exception e){
        System.out.println("enter a valid number"+e);
    }
   }
}
