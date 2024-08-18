//intermediater class
class Queue
{
    int x;
    boolean b=false;
     synchronized public void put(int j){
        try{
            if(b==true)
            {
                wait();                 
            }
            else
            {
                x=j;
                b=true;
                System.out.println("I have produced the data ino x "+x);
                notify();
             
            }
        }catch(Exception e)
        {
            System.out.println("something wrong");
        } 
    }

    synchronized public void get()
    {
        try{
            if(b==false){
                wait();
                
            }else{
                System.out.println("I had consumed the data x"+x); 
                b=false;
                notify();
            }
        }catch(Exception e)
        {
             System.out.println("something wrong");
        }
    }
}

class Producer extends Thread
{
    Queue q;
    Producer(Queue b)
    {
        q=b;
    }
    public void run()
    {
        int i=1;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer_1 extends Thread
{
     Queue p;
    Consumer_1(Queue b)
    {
        p=b;
    }
    public void run()
    {
        //int i=1;
        while(true){
            p.get();
          // i++;
        }
    }
}

public class MultithreadingPC
{

    public static void main(String []args)
   {
    Queue q=new Queue();
    Producer p=new Producer(q);
    Consumer_1 c=new Consumer_1(q);
    p.start();
   c.start(); 
   }    
}
