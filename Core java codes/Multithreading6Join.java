class Printing implements Runnable{
    public void run(){
       
        try{
            for(int i=0;i<3;i++){
                System.out.println("focus is important to master the skill");
                Thread.sleep(2000);
            }
       }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
       
    }
    

}

public class Multithreading6Join {
    public static void main(String []args) throws Exception
    {
        System.out.println("main Thread started");
        Printing p=new Printing();
        Thread t=new Thread(p);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println("Main thread finish the work");


    }

    
}
