public class Exception3 {
    public static void main(String []args)
    {
        int num1=6;
        int num2=2;
        int result=0;
        int []v={5,7,89,90};
        String name=null;
        try{
            result=num1/name.length();
            System.out.println(v[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divisible by zero"+e);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(  v[v.length-1]);
          System.out.println("stay in limit");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong.......   "+e);
            System.out.println(e.getMessage());
        }
        
        System.out.println(result);
    }    
}
