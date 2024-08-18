
import java.util.Map.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



class Student_std{
    private String name;
    private int age;
    private String city;

    public Student_std(String name,int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    
    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    
    public String getCity() {
        return city;
    }
    

    public String toString(){
        return name+" "+age+" "+city;

    }


}


public class Map3 {
    public static void main(String []args)
    {
        Student_std std1=new Student_std("srushti",19,"vishakhapatnam");
        Student_std std2=new Student_std("vrushti",15,"Ahmedabad");
        Student_std std3=new Student_std("prushti",15,"kolkata");

        Map m=new HashMap();
        m.put(1,std1);
        m.put(2,std2);
        m.put(3,std3);
        
        System.out.println(m);

        Set s=m.entrySet();
       Iterator itr=s.iterator();
       while(itr.hasNext())
       {
        //System.out.println(itr.next());

          Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey()+" : "+data.getValue());

       }





    
    }
}
