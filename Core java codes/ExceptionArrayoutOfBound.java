public class ExceptionArrayoutOfBound {
    public static void main(String []args)
    {
        int values[]={1,2,43,5};
        try{
            System.out.println(values[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

            System.out.println("error..."+e.getMessage());
        }
        
    }
    
}
