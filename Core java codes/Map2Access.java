import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map2Access {
    
    public static void main(String []args)
    {
        Map map=new HashMap();
        map.put(1,"Rohan");//Entry
        map.put(2,"Ruhan");
        map.put(3,"Rohit");
        map.put(4,"Ron");

        System.out.println(map);

        System.out.println(map.get(4));//printing entry

        System.out.println(map.keySet());

        Set keyset=map.keySet();
        Iterator itr=keyset.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());

             Integer key=(Integer)itr.next();
             System.out.println(key);
        }

         System.out.println(map.values());

       Collection values= map.values();
       Iterator itr1=values.iterator();
       while(itr1.hasNext()){
             //System.out.println(itr1.next());

             String str=(String)itr1.next();
             System.out.println(str);
        }

         System.out.println(map.entrySet());

        Set entrySet=map.entrySet();
        Iterator itr2=entrySet.iterator();
        while(itr2.hasNext()){
             //System.out.println(itr2.next());

             Map.Entry data=(Entry)itr2.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}
