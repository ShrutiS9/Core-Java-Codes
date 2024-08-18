import java.util.*;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

 class Collection1 extends Thread {
    public void run(){
   
         ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

        System.out.println("****************************************************");

        // for(int i=0;i<al.size();i++)
        // {
            
        //     System.out.println(al.get(i));
        //     al.add(100);
        // }


         System.out.println("*****************************************************");

         //fail fast
        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
           //Integer i=(Integer)itr.next();
            //System.out.println(i);
            System.out.println(itr.next());
            
             
           //itr.add(100);
        }
       

        System.out.println("****************************************************");

            //fail safe
        CopyOnWriteArrayList al1=new CopyOnWriteArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(100);
        System.out.println(al1);

        Iterator litr= al1.iterator();
        while(litr.hasNext())
        {
           //Integer i=(Integer)itr.next();
            //System.out.println(i);
            System.out.println(litr.next());
           al1.add(100);
        }

       
    }
}

public class Collection8FailFast{
 public static void main(String []args)
    {

        Collection1 c=new Collection1();
        // Collection1 c1=new Collection1();
         c.start();
        // c1.start();

    }
}


