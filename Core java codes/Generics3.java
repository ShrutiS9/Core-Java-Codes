import java.util.*;

class Gen<N>
{
    N obj;

    public Gen(N obj){
        this.obj=obj;
    }

    public Gen() {
    }

    void disp(){
        System.out.println("The type of data is"+obj.getClass().getName());
    }

    public N getObj(){
        return obj;

    }
}

public class Generics3 {
    public static void main(String[]args){


        Gen<Integer> g=new Gen<Integer>(10);
        g.disp();
        System.out.println(g.getObj());

        System.out.println("*******************************");

        Gen<String> g1=new Gen<String>("pw");
         g1.disp();
        System.out.println(g1.getObj());





        ArrayList<Gen> list1=new ArrayList<Gen>();
        List<String> list2=new ArrayList<String>();
        Collection<Integer> list3=new ArrayList<Integer>();

        //List<Object> list4=new ArrayList<String>(); CE
        List<Integer> list5=new ArrayList<Integer>();

        // List<int> list6=new ArrayList<int>();
        

        

    }
}
