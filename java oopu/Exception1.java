public class Exception1 {
    public static void main(String []args)
    {
        Exception1 ex=new Exception1();
        try{
            ex.run();
        }catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        public void run() throw IllegalArgumentException
        {
            
        }
    }
    
}
