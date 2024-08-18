class Library implements Runnable
{
    String res1=new String("MYSQL");
    String res2=new String("JAVA");
    String res3=new String("DSA");

    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("Student-1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                  {
                    System.out.println("Student 1 has acc  "+res1);
                    Thread.sleep(2000);
                    synchronized(res2)
                    {
                        System.out.println("Student 1 has acc  "+res2);
                         Thread.sleep(2000);
                         synchronized(res3)
                         {
                            System.out.println("Student 1 has acc  "+res3);
                            Thread.sleep(2000);
                         }

                    }

                }
                 }
            catch(Exception e)
            {
                System.out.println("Some problem");

            }
        }else{
            try{
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has acc  "+res3);
                    Thread.sleep(2000);
                    synchronized(res2)
                    {
                        System.out.println("Student 2 has acc  "+res2);
                         Thread.sleep(2000);
                         synchronized(res1)
                         {
                            System.out.println("Student 2 has acc  "+res1);
                            Thread.sleep(2000);

                         }

                    }

                }

            }catch(Exception e){
                System.out.println("Some problem");

            }
        }
    }
}








public class Multithreading9deadlock
{
    public static void main(String []args)
    {
        Library l=new Library();
        Thread t1=new Thread(l);
         Thread t2=new Thread(l);
         t1.setName("Student-1");
         t2.setName("Student-2");
        t1.start();
        t2.start();
    }
    
}
