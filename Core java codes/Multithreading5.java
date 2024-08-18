import java.util.*;
class MyThread1 extends Thread{
    public void run()
    {
        String tname=Thread.currentThread().getName();
        if(tname.equals("CALC")){
            Cal_c();
        }
        else{
            Importantmsg();
        }
        
    }
    public void Cal_c(){
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

    public void Importantmsg(){
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

public class Multithreading5 {
    public static void main(String []args) throws Exception{
        System.out.println("main start");
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
        System.out.println(t1.getName());
        t1.setName("CALC");
        t2.setName("PRINT");
        t1.start();
        t2.start();
       // t1.join();
        
        t2.join();
          System.out.println("main end");
    }
}
