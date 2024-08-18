import java.util.HashMap;
import java.util.WeakHashMap;

class Employee{
    private int Empid;
    private String name;

    public Employee(String name,int Empid)
    {
        this.name=name;
        this.Empid=Empid;
    }

    public String toString()
    {
        return Empid+" ";
    }

    @Override
    public void finalize(){
        System.out.println("clean up work by gc before de allocating memory from heap"); 
    }
}

public class Map5 {
    public static void main(String []args)
    {
        Employee e=new Employee("vishwa",171);

       // HashMap hm=new HashMap();
       // hm.put(e,"vishwa");
       // System.out.println(hm);
        // System.out.println(e);
        //e=null;//eligible for garbage colection;
        
       //System.gc();//invoking gc
       // System.out.println(e);
        // System.out.println(hm);
       // System.out.println("last line");




        WeakHashMap whm=new WeakHashMap();
        whm.put(e,"vishwa");
        System.out.println(whm);
        // System.out.println(e);
        e=null;//eligible for garbage colection;
        
        System.gc();//invoking gc
       // System.out.println(e);
         System.out.println(whm);
        System.out.println("last line");


    }
}
