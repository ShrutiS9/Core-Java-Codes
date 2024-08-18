import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.function.Predicate;
import java.util.stream.Stream;


public class API4stream {
    public static void main(String []args)
    {
        List<Integer> list=Arrays.asList(8,4,2,7,5);
        //if we don't want change to data and perfor, certain task on it then create seperate stream
        List<Integer> streamList=list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("****************"+streamList);
        System.out.println("****************"+list);
        


        Stream<Integer> streamdata=list.stream();//make a stream to perform single task

        // Predicate<Integer> pre=new Predicate<Integer>() {
        //     public boolean test(Integer i)
        //     {
        //         if(i%2==0)
        //         return true;
        //         else
        //         return false;
                
        //     }
        // };
        
        Stream<Integer> finaldata=streamdata.filter(/*pre*/n->n%2==0).sorted().map(n->n*2);
        finaldata.forEach(n->System.out.println(n));

        Stream<Integer> s=Stream.of(99,999,9999,99999);
        s.forEach(System.out::println);
        Double[] d={10.0,10.1,10.2,10.3};
        Stream s1=Stream.of(d);
        s1.forEach(System.out :: println);

        //Stream<Integer> fildata=streamdata.filter(n->n%2==0);
        // long count=streamdata.count();
        // System.out.println(count);
        // Stream<Integer> sortedstream= fildata.sorted();
        // Stream<Integer> mapstream=sortedstream.map(n->n*2);
        // mapstream.forEach(n->System.out.println(n));
       
        // sortedstream.forEach(n->System.out.println(n));
        // streamdata.forEach(n->System.out.println(n));

    }
    
}
