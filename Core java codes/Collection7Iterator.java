import java.util.*;



public class Collection7Iterator {
    public static void main(String []args)
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

        System.out.println("****************************************************");
        //for loop
        for(int i=0;i<al.size();i++)
        {
            ///Object o=al.get(i);
           // System.out.println(o);
            System.out.println(al.get(i));
        }

        System.out.println("*****************************************************");
        //for each
        for(Object o:al){
            System.out.println(o);
        }

        System.out.println("*****************************************************");
        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
           //Integer i=(Integer)itr.next();
            //System.out.println(i);
            System.out.println(itr.next());
        }

        System.out.println("****************************************************");

        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        litr.add(32);
         System.out.println(al);

    }
    
}
