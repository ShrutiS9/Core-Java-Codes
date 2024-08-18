import java.util.PriorityQueue;

public class Collection4PriorityQueue {
    public static void main(String []args)
    {
        PriorityQueue pq=new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
       // pq.add("pw");
        System.out.println(pq);
        pq.add(25);
        
    
        System.out.println(pq);
        System.out.println(pq.remove(25));
        System.out.println(pq.remove());
        System.out.println(pq);

    }

}
