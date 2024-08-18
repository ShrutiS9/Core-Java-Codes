class Example implements Runnable{
    public void run(){
        
         for(int i=0;i<3;i++){
        try{
           
                System.out.println("focus is important to master the skill");
                Thread.sleep(2000);
                //Thread.interrupted();
            }
        
        catch(Exception e)
        {
            System.out.println("Thread is interrupt");
        }
       
    }


    }
}


public class Multithreading7Interrupt 
{
    public static void main(String []args)
    {
        Example m=new Example();
        Thread t=new Thread(m);
        t.start();
        t.interrupt();

    }    
}
