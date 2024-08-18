public class Exception
{
    public static void main(String []args)
    {
        Thread t1=new Thread(new Runnable() {
            public void run()
            {
                try{
                    Thread.sleep(10);
                }
                catch(IllegalArgumentException e)
                {
                    e.printStackTrace();
                    System.out.print(e.getMessage());
                }
                System.out.println("hello");

            }
        });
        t1.setName("test thread");
        t1.start();
    }
}