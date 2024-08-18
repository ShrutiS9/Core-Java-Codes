import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;


public class API3 {
    public static void main (String []args){
        // List<Integer> list=new ArrayList<Integer>();
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(8);
        // list.add(9);

        // System.out.println(list);

        List<Integer> list_1=Arrays.asList(2,4,5,8,9);
         System.out.println(list_1);

        Consumer<Integer> cons=new Consumer<Integer>(){
            @Override
            public void accept(Integer i){          
            
                System.out.println(i);    
            }
        };
        list_1.forEach(cons);
         //list.forEach(n->System.out.println(n));




    }
}
