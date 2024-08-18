import java.util.Scanner;
import java.lang.Runnable;

class Calc1 implements Runnable{
    public void run()
    {
        System.out.println("calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter First number");
        int num1=sc.nextInt();

        System.out.println("please enter Scecond number");
        int num2=sc.nextInt();
        int result=num1+num2;

        System.out.println(result);
        System.out.println("calculation Task ended");

        System.out.println("***************************************************");

    }
}

class Message implements Runnable{
    public void run(){
        System.out.println("displayinmg important message task");
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
        System.out.println("Displaying import message task ended");


    }
}

public class Multithreading4Method2 {
    public static void main(String []args){
        System.out.println("Main Thread Started ");
        Calc1 c1=new Calc1();

        Message m1=new Message();

       
        Thread t1=new Thread(c1); 
        Thread t2=new Thread(m1);

        t1.start();
        t2.start();


    }

    
}
