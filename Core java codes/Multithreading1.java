public class Multithreading1 {
    public static void main(String []args)
    {
        System.out.println("Main Thread");
        System.out.println("Before changing");
        String name=Thread.currentThread().getName();
        System.out.println("the name of main thread is "+name);
        System.out.println("the priority of main thread is "+Thread.currentThread().getPriority());

        System.out.println("After changing");
        Thread t=Thread.currentThread();
        t.setName("pw");
       // Thread.currentThread().setName("skill");
        t.setPriority(1);
         String name1=Thread.currentThread().getName();
        System.out.println("the name of main thread is "+name1);
        System.out.println("the priority of main thread is "+Thread.currentThread().getPriority());

    }
    
}
