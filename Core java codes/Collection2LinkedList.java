import java.util.*;

public class Collection2LinkedList {
    public static void main(String []args)
    {
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);

        System.out.println(ll1);
        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));

        LinkedList ll2=new LinkedList();

        ll2.add("PW SKILL");
        ll2.add(1);
        ll2.add('j');

        System.out.println(ll2);
        System.out.println("*********************************************");

        LinkedList ll3=new LinkedList();
        
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);
         System.out.println(ll3);


        System.out.println(ll3.get(1));
        System.out.println(ll3.indexOf(300));
        System.out.println(ll3.lastIndexOf(300));
        System.out.println(ll3.getFirst());
        System.out.println(ll3.getLast());

        ll3.push(10);
        System.out.println(ll3);
         System.out.println(ll3.poll());

        ll3.addFirst("pw");
        ll3.addLast(100);

        System.out.println(ll3);

        System.out.println(ll3.remove(1));
        ll3.add(2,100);
        System.out.println(ll3);

        System.out.println(ll3.peek());
        System.out.println(ll3);
       

        System.out.println(ll3.poll());
        System.out.println(ll3);
         System.out.println(ll3.remove());
    }
}
