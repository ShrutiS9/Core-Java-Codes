
    // Java program of multithreading
// with static synchronized

class Display11
{
   
	public static  synchronized void wish(String name)
	{
		for(int i=0;i<3;i++)
		{
			System.out.print("Good Morning: ");
			System.out.println(name);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class MyThread extends Thread{
	Display11 d;
	String name;
	MyThread(Display11 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		try{
        Thread.sleep(2000);
       }catch(InterruptedException e)
       {
        
       }
	}
}

public class Multithreadingsync {
	public static void main(String arg[])
	{
		Display11 d1=new Display11();
		Display11 d2=new Display11();
		MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d2,"Yuvaraj");
		t1.start();
		t2.start();
	}
}


