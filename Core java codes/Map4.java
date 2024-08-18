import java.util.Hashtable;
import java.util.TreeMap;

public class Map4 {
    public static void main(String []args){
        Hashtable ht=new Hashtable();
        ht.put(1,"Rohit");
        ///ht.put(2,"Rohan");
        //ht.put(6,null);
        ht.put(3, "ron");
       
        ht.put('j', "ron");
        ht.putIfAbsent(2,"Rohan");
       //ht.put(null,"himesh");  
      // ht.put(null,null);
       System.out.println(ht);


        TreeMap tm=new TreeMap();

        Integer i=new Integer(5);
        tm.put(i, "Rohit");
        tm.put(2, "Ruhan");
        tm.put(3, "Rohan");
        //ht.put(null,"himesh");  
       //ht.put(null,null);
       //ht.put(6,null);

        System.out.println(tm);
    }
}
