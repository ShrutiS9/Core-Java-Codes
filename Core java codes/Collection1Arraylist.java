//import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection1Arraylist
{
        public static void main(String []args)
        {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        System.out.println(al1.add(300));
        System.out.println(al1.contains(300));
        System.out.println(al1.containsAll(al1));
        
        System.out.println(al1.indexOf(300));
        System.out.println(al1.size());

        al1.ensureCapacity(10);
        //System.out.println(al1.ensureCapacity(10));
        al1.trimToSize();
         System.out.println(al1.size());
        al1.clear();
         System.out.println(al1);

         System.out.println("************************************");


         List la1=new ArrayList();
         la1.add(4);
         System.out.println(la1);

        
        System.out.println("************************************");

        ArrayList al2=new ArrayList();
        al2.add("PW SKILLS");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);

        System.out.println("************************************");

        al2.add(100);
        System.out.println(al2);

        System.out.println("************************************");

        ArrayList al3=new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println(al3);

        System.out.println("After adding collection");

        System.out.println(al3.addAll(al2));
        System.out.println(al3);

        System.out.println("************************************");

        al3.add(2, "PW SKILL");
        System.out.println(al3);

        al3.add(100);
       

         System.out.println(al3);
        System.out.println(al3.clone());
        System.out.println(al3.isEmpty());
        System.out.println(al3);
        

        al3.addAll(1, al2);
        System.out.println(al3.get(0));


        System.out.println(al3);
        ArrayList al4=new ArrayList(6);
        System.out.println("************************************");
        ArrayList al5=new ArrayList(al3);

        System.out.println(al5);
    }
}
