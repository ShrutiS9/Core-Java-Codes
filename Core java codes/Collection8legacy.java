import java.util.*;

class Collection8 extends Thread
{
    public  void run(){
        Vector v=new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        System.out.println(v);

       Enumeration en=v.elements();
        while(en.hasMoreElements())
        {
            Integer i=(Integer)en.nextElement();
            //System.out.println(en.nextElement());
            System.out.println(i);
        }




    }
}
public class Collection8legacy{
    public static void main(String []args)
    {
        Collection8 c=new Collection8();
        Collection8 c1=new Collection8();
        c.start();

        c1.start();
    }
}
