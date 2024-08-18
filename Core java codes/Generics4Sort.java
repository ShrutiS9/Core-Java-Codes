import java.util.*;

public class Generics4Sort {
    public static void main(String []args)
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al1=new ArrayList<String>();
        al1.add("PW");
        al1.add("HYDER");
        al1.add("JAVA");
        al1.add("ROHAN");

        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList al3=new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);

        System.out.println(al3);
        int index=Collections.binarySearch(al3,100);
        System.out.println("Index is"+index);


        Collections.rotate(al3, 2);
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println(al3);

        System.out.println(Collections.frequency(al1, 20));
      



        
       
    }
}
